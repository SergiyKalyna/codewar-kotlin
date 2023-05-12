object WeightConverter {

    fun String.toWeight(): Weight {
        val digitWeight = getDigitWeight(this)

        return Weight(digitWeight, this)
    }

    private fun getDigitWeight(textWeight: String): Int {
        return textWeight.mapNotNull { it.toString().toIntOrNull() }.sum()
    }
}