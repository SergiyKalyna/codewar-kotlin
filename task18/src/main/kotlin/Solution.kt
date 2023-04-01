class Solution {

    /*
    Calculated final amount of gold obtained by A and B in a tuple* ( amount of A, amount of B ).
    *list / tuple representation varies with language - see Example tests
    Note, we can assume that A always takes first, and each time they used the best strategy.
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val goldDivider = GoldDivider()
            println(goldDivider.getBestDividing(intArrayOf(10, 1000, 2, 1)))
        }
    }
}