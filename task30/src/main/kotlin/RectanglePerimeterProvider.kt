class RectanglePerimeterProvider {

    fun getRectanglePerimeter(inputSquaresQuantity: Int): Int {
        val squaresSidesInsideRectangle = getSquareSidesInsideRectangle(inputSquaresQuantity)

        return getSquaresPerimeter(squaresSidesInsideRectangle)
    }

    private fun getSquareSidesInsideRectangle(positionOfSquares: Int): List<Int> {
        if (positionOfSquares == 0) return listOf(1)

        val squaresSides = mutableListOf<Int>()
        squaresSides.add(1)

        var currentValue = 0

        for (number in 0 until positionOfSquares) {
            val side =  squaresSides.last() + currentValue
            squaresSides.add(side)

            currentValue = squaresSides[number]
        }

        return squaresSides
    }

    private fun getSquaresPerimeter(squaresSides: List<Int>): Int {
        val sumOfTheSides = squaresSides.sum()

        return sumOfTheSides * 4
    }
}