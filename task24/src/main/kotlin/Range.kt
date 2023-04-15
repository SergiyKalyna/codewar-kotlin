data class Range(
    val startRange: Int,
    val endRange: Int
) {
    fun format(): String {
        return if (startRange == endRange) {
            "$startRange"
        } else if (endRange - startRange == 1) {
            "$startRange,$endRange"
        } else {
            "$startRange-$endRange"
        }
    }
}
