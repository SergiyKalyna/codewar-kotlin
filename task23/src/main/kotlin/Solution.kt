class Solution {

    /*
    Create a function that takes a positive integer and returns the next bigger number that can be formed
    by rearranging one digit. For example:

      12 ==> 21
     513 ==> 531
    If the digits can't be rearranged to form a bigger number, return -1 (or nil in Swift, None in Rust)
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(nextBiggerNumber(12))
            println(nextBiggerNumber(513))
            println(nextBiggerNumber(2017))
            println(nextBiggerNumber(111))
            println(nextBiggerNumber(510))
        }

        private fun nextBiggerNumber(n: Long): Long {
            val digits = n.toString().map { it.toString().toInt() }

            val rearrangedDigits = rearrangeBigNumberForward(digits)

            if (digits == rearrangedDigits) return -1

            return collectDigitsToNumberValue(rearrangedDigits)
        }

        private fun rearrangeBigNumberForward(digits: List<Int>): List<Int> {
            val rearrangedDigits = mutableListOf<Int>()
            rearrangedDigits.addAll(digits)

            var shouldBreakLoop = false
            for (index in 1 until rearrangedDigits.size) {
                if (rearrangedDigits[index] > rearrangedDigits[index - 1]) {
                    rearrangedDigits[index] = digits[index - 1]
                    rearrangedDigits[index - 1] = digits[index]

                    shouldBreakLoop = true
                }
                if (shouldBreakLoop) break
            }

            return rearrangedDigits
        }

        private fun collectDigitsToNumberValue(digits: List<Int>): Long {
            return digits.joinToString("").toLong()
        }
    }
}