data class NumberWeightData(
    val weight: Int,
    val positionIndex: Int,
    val originalValue: Int
) {

    fun toWeightArray(): IntArray {
        return intArrayOf(this.weight, this.positionIndex, this.originalValue)
    }
}


