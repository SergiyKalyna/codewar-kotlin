class Solution {

    /*
    Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer.
    You don't need to validate the form of the Roman numeral.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val decoder = RomanNumeralDecoder()

            println(decoder.decode("MCMXC"))
        }
    }
}