import kotlin.math.abs

class Solution {

    /*
    Consider the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n where x is a real number and n a positive integer.

    When n goes to infinity and x has a correct value (ie x is in its domain of convergence D), U(n, x)
    goes to a finite limit m depending on x.

    Usually given x we try to find m. Here we will try to find x (x real, 0 < x < 1) when m is given (m real, m > 0).

    Let us call solve the function solve(m) which returns x such as U(n, x) goes to m when n goes to infinity.

    Examples:
    solve(2.0) returns 0.5 since U(n, 0.5) goes to 2 when n goes to infinity.
    solve(8.0) returns 0.7034648345913732 since U(n, 0.7034648345913732) goes to 8 when n goes to infinity.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val inputValue1 = 2.0
            val inputValue2 = 8.0

            println(getLastX(inputValue1))
            println(getLastX(inputValue2))
        }

        private fun getLastX(inputValue: Double): Double {
            var xLast = 0.5
            var mLast = findM(xLast)
            var xMin = 0.0
            var xMax = 1.0
            while (abs(inputValue - mLast) > 1e-11) {
                if (mLast > inputValue) xMax = xLast
                else xMin = xLast
                xLast = xMin + (xMax - xMin) / 2
                val mNew = findM(xLast)
                if (mNew == mLast) break
                mLast = mNew
            }
            return xLast
        }

        private fun findM(x: Double): Double {
            var result = 0.0
            var summand = 1.0
            var i = 1
            while (summand > 1e-16) {
                summand *= x
                result += i * summand
                i++
            }
            return result
        }
    }
}