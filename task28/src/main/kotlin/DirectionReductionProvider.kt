import Direction.Companion.opposite

class DirectionReductionProvider {

    fun getReducingDirection(inputDirections: Array<String>): Array<String> {
        val directions = convertToDirections(inputDirections)
        val reducedDirections = getReducedDirections(directions)

        return reducedDirections.map { it.toString() }.toTypedArray()
    }

    private fun convertToDirections(inputDirections: Array<String>): List<Direction> {
        return inputDirections.map { Direction.valueOf(it) }
    }

    private fun getReducedDirections(directions: List<Direction>): List<Direction> {
        val result = mutableListOf<Direction>()

        directions.forEach {
            if (result.isNotEmpty() && result.last() == it.opposite()) {
                result.removeAt(result.lastIndex)
            } else {
                result.add(it)
            }
        }

        return result
    }
}