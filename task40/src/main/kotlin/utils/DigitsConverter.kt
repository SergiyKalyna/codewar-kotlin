package utils

object DigitsConverter {

    fun toDigitsArray(number: Long): CharArray {
        return number.toString().toCharArray()
    }

    fun toLong(digits: CharArray): Long {
        return String(digits).toLong()
    }
}