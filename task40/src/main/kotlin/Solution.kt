class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val swapIndexFinder = SwapIndexFinder()
            val smallestGreaterIndexFinder = SmallestGreaterIndexFinder()
            val nextBiggerNumberCalculator = NextBiggerNumberCalculator(swapIndexFinder, smallestGreaterIndexFinder)

            println(nextBiggerNumberCalculator.calculateNextBiggerNumber(12))
            println(nextBiggerNumberCalculator.calculateNextBiggerNumber(513))
            println(nextBiggerNumberCalculator.calculateNextBiggerNumber(9))
            println(nextBiggerNumberCalculator.calculateNextBiggerNumber(111))
        }
    }
}