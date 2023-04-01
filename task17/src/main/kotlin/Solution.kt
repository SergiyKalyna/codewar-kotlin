class Solution {

    /*
    Consider a sequence u where u is defined as follows:

    The number u(0) = 1 is the first one in u.
    For each x in u, then y = 2 * x + 1 and z = 3 * x + 1 must be in u too.
    There are no other numbers in u.
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val linearCounter = TwiceLinearCounter()

            println(linearCounter.countLinear(20))
        }
    }
}