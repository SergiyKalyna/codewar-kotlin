class PrimeDecompositionProvider {

    fun getDecomposition(inputNumber: Int): String {
        val decomposed = mutableMapOf<Int, Int>()
        var divisor = inputNumber

        for (factor in 2..inputNumber)  {
            while (divisor % factor == 0) {
                divisor /= factor
                decomposed[factor] = (decomposed[factor] ?: 0) + 1
            }
        }

        return decomposed
            .entries
            .sortedBy { it.key }
            .joinToString("") { convertToString(it) }
    }

    private fun convertToString(entry: Map.Entry<Int, Int>): String {
        val key = entry.key
        val value = entry.value
        return "(" + (if (value == 1) "$key" else "$key**$value") + ")"
    }
}