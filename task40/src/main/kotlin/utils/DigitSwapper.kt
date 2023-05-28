package utils

object DigitSwapper {

    fun swapDigits(digits: CharArray, firstIndex: Int, secondIndex: Int) {
        val temp = digits[firstIndex]
        digits[firstIndex] = digits[secondIndex]
        digits[secondIndex] = temp
    }
}