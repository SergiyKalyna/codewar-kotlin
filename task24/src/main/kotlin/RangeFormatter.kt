class RangeFormatter {

    fun formatToRange(arr: IntArray): String {
        if (arr.isEmpty()) return ""

        val sortedNumbers = arr.sorted()
        val ranges = getRanges(sortedNumbers)

        return ranges.joinToString(",") { it.format() }
    }

    private fun getRanges(numbers: List<Int>): List<Range> {
        val ranges = mutableListOf<Range>()
        var currentRange = Range(numbers[0], numbers[0])

        for (index in 1 until numbers.size) {
            currentRange = if (numbers[index] == currentRange.endRange + 1) {
                Range(currentRange.startRange, numbers[index])
            } else {
                ranges.add(currentRange)
                Range(numbers[index], numbers[index])
            }
        }

        ranges.add(currentRange)

        return ranges
    }
}