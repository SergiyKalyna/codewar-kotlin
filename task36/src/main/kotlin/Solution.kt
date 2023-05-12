class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val weightSorter = WeightSorter()

            println(weightSorter.orderWeight(""))
            println(weightSorter.orderWeight("103 123 4444 99 2000"))
            println(weightSorter.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"))
        }
    }
}