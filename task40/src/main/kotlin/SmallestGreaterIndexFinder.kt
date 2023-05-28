class SmallestGreaterIndexFinder {

    fun findSmallestGreaterIndex(digits: CharArray, swapIndex: Int): Int {
        var smallestGreaterIndex = digits.size - 1
        while (digits[smallestGreaterIndex] <= digits[swapIndex]) {
            smallestGreaterIndex--
        }
        return smallestGreaterIndex
    }
}