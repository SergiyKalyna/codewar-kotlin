class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val fractionConverter = FractionConverter()
            val input = arrayOf(
                longArrayOf(1, 2),
                longArrayOf(1, 3),
                longArrayOf(1, 4)
            )

            println(fractionConverter.convertFrac(input))
        }
    }
}