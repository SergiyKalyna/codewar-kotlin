class SwapIndexFinder {

    fun findSwapIndex(digits: CharArray): Int {
        var rightDigitIndex = digits.size - 2
        while (rightDigitIndex >= 0 && digits[rightDigitIndex] >= digits[rightDigitIndex + 1]) {
            rightDigitIndex--
        }
        return rightDigitIndex
    }
}