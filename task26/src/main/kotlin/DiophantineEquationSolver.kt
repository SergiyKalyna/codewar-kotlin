class DiophantineEquationSolver {

    companion object {
        private const val DEFAULT_VALUE = "[]"
    }

    fun countEquation(number: Long): String {
        if (number <= 0) return DEFAULT_VALUE

        val solutions = mutableListOf<DiophantineSolution>()

        for (firstPossibleValue in 1..number) {
            if (number % firstPossibleValue == 0L) {
                val secondPossibleValue = number / firstPossibleValue
                val diophantineSolution = getDiophantineSolution(firstPossibleValue, secondPossibleValue)

                if (diophantineSolution != null) solutions.add(diophantineSolution)
            }
        }

        return solutions.reversed().toString()
    }

    private fun getDiophantineSolution(firstPossibleValue: Long, secondPossibleValue: Long): DiophantineSolution? {
        val diffs = firstPossibleValue - secondPossibleValue

        if (diffs % 4 != 0L) return null

        val yValue = diffs / 4
        val xValue = firstPossibleValue - 2 * yValue

        if (yValue <= 0 || xValue <= 0) return null

        return DiophantineSolution(xValue, yValue)
    }
}