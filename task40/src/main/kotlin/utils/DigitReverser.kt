package utils

object DigitReverser {

    fun reverseDigitsAfterIndex(digits: CharArray, startIndex: Int) {
        var left = startIndex + 1
        var right = digits.size - 1
        while (left < right) {
            DigitSwapper.swapDigits(digits, left, right)
            left++
            right--
        }
    }
}