class TribonacciCounter {

    fun countTribonacciArray(signature: DoubleArray, n: Int): DoubleArray {
        if (n <= 0) return doubleArrayOf()

        val tribonacciValues = signature.toMutableList()

        for (count in 0 until n) {
            val last3Values = tribonacciValues.subList(count, count + 3)
            val tribonacciValue = countTribonacciValue(last3Values)

            tribonacciValues.add(tribonacciValue)
        }

        return tribonacciValues.toDoubleArray()
    }

    private fun countTribonacciValue(last3Values: List<Double>): Double {
        return last3Values.sum()
    }
}