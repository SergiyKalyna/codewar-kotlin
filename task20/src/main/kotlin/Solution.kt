import java.math.BigInteger

class Solution {

    /*
    Define a function that takes in two non-negative integers a and b and returns the last decimal digit of
    a and b (power). Note that a and b may be very large!
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val lastDigitProvider = LastDigitProvider()

            println(lastDigitProvider.getLastDigit(BigInteger.valueOf(4L), BigInteger.valueOf(1L)))
        }
    }
}