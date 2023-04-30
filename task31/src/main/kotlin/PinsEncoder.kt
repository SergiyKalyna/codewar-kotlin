class PinsEncoder {

    private val adjacentDigitsMap = mapOf(
        '0' to listOf('8', '0'),
        '1' to listOf('1', '2', '4'),
        '2' to listOf('1', '2', '3', '5'),
        '3' to listOf('2', '3', '6'),
        '4' to listOf('1', '4', '5', '7'),
        '5' to listOf('2', '4', '5', '6', '8'),
        '6' to listOf('3', '5', '6', '9'),
        '7' to listOf('4', '7', '8'),
        '8' to listOf('5', '7', '8', '9', '0'),
        '9' to listOf('6', '8', '9')
    )

    fun getPINs(observedPin: String): List<String> {
        val variations = mutableListOf<String>()
        generateVariations(observedPin, "", variations)

        return variations
    }

    private fun generateVariations(
        observed: String,
        current: String,
        variations: MutableList<String>
    ) {
        if (current.length == observed.length) {
            variations.add(current)
        } else {
            val nextDigit = observed[current.length]
            val digits = getAdjacentDigitsByNumber(nextDigit)

            for (adjacent in digits) {
                generateVariations(observed, current + adjacent, variations)
            }
        }
    }

    private fun getAdjacentDigitsByNumber(number: Char): List<Char> {
        return adjacentDigitsMap[number]
            ?: throw RuntimeException("Observed pin should contain only digit, wrong char - [$number]")
    }
}