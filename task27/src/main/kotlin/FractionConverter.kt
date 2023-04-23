class FractionConverter {

    fun convertFrac(longArrays: Array<LongArray>): String {
        val fractions = longArrays.map { Fraction(it[0], it[1]) }
        val convertedFractions = convertFractions(fractions)

        return convertedFractions.joinToString(separator = "") { "(${it.numerator},${it.denominator})" }
    }

    private fun convertFractions(fractions: List<Fraction>): List<Fraction> {
        val denominators = fractions.map { it.denominator }
        val lcm = findLeastCommonMultiple(denominators)

        return fractions.map { Fraction(it.numerator * (lcm / it.denominator), lcm) }
    }

    private fun findLeastCommonMultiple(numbers: List<Long>): Long {
        val maxNumber = numbers.maxOrNull() ?: 1
        var lcm = maxNumber

        while (true) {
            if (numbers.all { lcm % it == 0L }) {
                return lcm
            }
            lcm += maxNumber
        }
    }
}