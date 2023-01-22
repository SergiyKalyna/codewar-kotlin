class Solution {
    /*
    Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arrayWithDuplicates = intArrayOf(1, 2, 3, 1, 2, 1, 2, 3, 3, 4, 2, 2, 1, 3, 2, 1)

            println(arrayWithDuplicates.forEach { print("$it ") })
            println("")
            println(deleteDuplicates(arrayWithDuplicates, 2).forEach { print("$it ") })
            println(deleteDuplicates(arrayWithDuplicates, 3).forEach { print("$it ") })
        }

        private fun deleteDuplicates(elements: IntArray, maxOccurrences: Int): IntArray {
            val filteredList = ArrayList<Int>()

            elements.forEach { element ->
                val count = filteredList.count { it == element }
                if (count != maxOccurrences) filteredList.add(element)
            }

            return filteredList.toIntArray()
        }
    }
}