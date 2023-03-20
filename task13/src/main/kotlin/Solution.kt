class Solution {

    /*
    you need to create a fibonacci function that given a signature array/list,
    returns the first n elements - signature included of the so seeded sequence.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val counter = TribonacciCounter()
            val testCase = doubleArrayOf(0.0, 1.0, 1.0)
            val desireCount = 10

            val result = counter.countTribonacciArray(testCase, desireCount)

           result.forEach { println(it) }
        }
    }
}