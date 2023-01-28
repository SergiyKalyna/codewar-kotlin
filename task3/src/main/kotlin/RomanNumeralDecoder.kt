class RomanNumeralDecoder {
    fun decode(inputRomanNumeral: String): Int {
        if (inputRomanNumeral.isBlank()) return 0

        val romanNumericSymbols = getAllRomanNumericSymbols(inputRomanNumeral)

        return calculateRomanNumericValue(romanNumericSymbols)
    }

    private fun getAllRomanNumericSymbols(romanNumeric: String): List<String> {
        return romanNumeric.split("").filterNot { it.isBlank() }
    }

    private fun calculateRomanNumericValue(romanNumericSymbols: List<String>): Int {
        val numbersList = parseRomanNumericListToNumbers(romanNumericSymbols)

        return calculateSumOfNumbers(numbersList)
    }

    private fun parseRomanNumericListToNumbers(romanNumericSymbols: List<String>): List<Int> {
        return romanNumericSymbols.map { RomanNumerals.valueOf(it).value }
    }

    private fun calculateSumOfNumbers(numbersList: List<Int>): Int {
        var sum = numbersList[0]

        for (i in 1 until numbersList.size) {
            sum += if (numbersList[i] > numbersList[i - 1]) {
                numbersList[i] - (numbersList[i - 1] * 2)
            } else numbersList[i]
        }

        return sum
    }
}