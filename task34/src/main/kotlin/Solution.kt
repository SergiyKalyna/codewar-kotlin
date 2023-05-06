class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bestTravelCounter = BestTravelCounter()

            println(bestTravelCounter.chooseBestRout(163, 3, listOf(50, 56, 57, 58, 59, 60)))
            println(bestTravelCounter.chooseBestRout(20, 3, listOf(50, 56)))
        }
    }
}