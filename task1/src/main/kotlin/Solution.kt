import kotlin.math.min

class Solution {
    /*
    How many squares inside rectangle
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(sqInRect(20, 14))
        }

        fun sqInRect(lng: Int, wdth: Int): List<Int>? {
            if (lng == wdth) return null

            val results: MutableList<Int> = ArrayList()
            var area = lng * wdth
            var minSide = lng
            var anotherSide: Int

            while (area > 1) {
                anotherSide = area / minSide
                minSide = min(minSide, anotherSide)
                results.add(minSide)

                area -= minSide * minSide
            }

            if (area != 0) results.add(area)
            return results
        }
    }
}