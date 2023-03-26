class Solution {

    /*
     The objective of this kata is to determine the number of pair of gloves you can
     constitute from the gloves you have in your drawer
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val gloves1 = listOf("red", "green", "red", "blue", "blue")
            val gloves2 = listOf("red", "red", "red", "red", "red", "red")

            val pairs1 = numberOfPairs(gloves1)
            val pairs2 = numberOfPairs(gloves2)

            println("Number of pairs in gloves1: $pairs1")
            println("Number of pairs in gloves2: $pairs2")
        }

        private fun numberOfPairs(gloves: List<String>): Int {
            if (gloves.isEmpty()) return 0

            val groupedGloves = gloves.groupingBy { it }.eachCount()

            var pairs = 0
            groupedGloves.values.forEach { glovesQuantity ->
                pairs += glovesQuantity / 2
            }

            return pairs
        }
    }
}