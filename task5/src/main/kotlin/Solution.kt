class Solution {

    /*
    Given two arrays a and b write a function comp(a, b) or (compSame(a, b)) that checks whether the two arrays have
    the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears).
    "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val firstArray = intArrayOf(2, 4, 6, 8)
            val secondArray = intArrayOf(4, 16, 36, 64)

            println(comp(firstArray, secondArray))
        }

        private fun comp(firstArray: IntArray?, secondArray: IntArray?): Boolean {
            if (!checkValidInputArrays(firstArray, secondArray)) return false

            return checkSecondArrayContainsSquareNumbersOfFirstArray(firstArray!!, secondArray!!)
        }

        private fun checkValidInputArrays(firstArray: IntArray?, secondArray: IntArray?): Boolean {
            if (firstArray == null || secondArray == null) return false

            if (firstArray.isEmpty() || secondArray.isEmpty()) return false

            if (firstArray.size != secondArray.size) return false

            return true
        }

        private fun checkSecondArrayContainsSquareNumbersOfFirstArray(
            firstArray: IntArray,
            secondArray: IntArray
        ): Boolean {
            firstArray.forEach { number ->
                if (!secondArray.contains(number * number)) return false
            }

            return true
        }
    }
}