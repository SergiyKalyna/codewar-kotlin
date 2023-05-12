class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val factorialDecompositionProvider = FactorialDecompositionProvider()

            println(factorialDecompositionProvider.getDecomposeResult(12))
        }
    }
}