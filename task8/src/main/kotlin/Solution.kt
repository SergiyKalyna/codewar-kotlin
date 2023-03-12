class Solution {

    /*
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
    that occur more than once in the input string. The input string can be assumed to contain only alphabets
    (both uppercase and lowercase) and numeric digits.
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val input = "Indivisibilities"
            val duplicates = duplicateCount(input)

            println("Input: $input")
            println("Duplicate count: $duplicates")
        }

        private fun duplicateCount(text: String): Int {
            val chars = text.toCharArray()
            val groupedChars = chars.groupBy { it }

            return groupedChars.values.count { it.size > 1 }
        }
    }
}