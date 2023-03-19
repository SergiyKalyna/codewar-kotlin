class Solution {

    /*
    Write a function that takes an array of numbers (integers for the tests) and a target number.
    It should find two different items in the array that, when added together, give the target value.
    The indices of these items should then be returned in a tuple / list (depending on your language) like so:
    (index1, index2).
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val numbers = intArrayOf(1, 2, 3)
            val target = 4

            println(twoSum(numbers, target))
        }

        private fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int> {
            var firstIndex = 0
            var secondIndex = 0

            numbers.forEachIndexed { index, number ->
                if (numbers.contains(target - number)) {
                    firstIndex = index
                    secondIndex = numbers.indexOf(target - number)
                }
            }
            return Pair(firstIndex, secondIndex)
        }
    }
}