class BestTravelCounter {

    fun chooseBestRout(maxDistance: Int, countOfCity: Int, distancesBetweenTowns: List<Int>): Int {
        val possibleRouts = getPossibleRouts(countOfCity, distancesBetweenTowns)

        val bestRoutDistance = possibleRouts.filterNot { it.sum() > maxDistance }.maxOfOrNull { it.sum() }

        return bestRoutDistance ?: -1
    }

    private fun getPossibleRouts(countOfCity: Int, distancesBetweenTowns: List<Int>): List<IntArray> {
        val possibleRouts = mutableListOf<IntArray>()
        val selectedTowns = IntArray(countOfCity)

        getPossibleRoutsHelper(possibleRouts, selectedTowns, 0, distancesBetweenTowns)

        return possibleRouts
    }

    private fun getPossibleRoutsHelper(
        possibleRouts: MutableList<IntArray>,
        selectedTowns: IntArray,
        index: Int,
        distancesBetweenTowns: List<Int>
    ) {
        if (index == selectedTowns.size) {
            possibleRouts.add(selectedTowns.map { distancesBetweenTowns[it] }.toIntArray())
            return
        }

        val startIterationIndex = getStartIterationIndex(index, selectedTowns)
        for (i in startIterationIndex until distancesBetweenTowns.size) {
            selectedTowns[index] = i
            getPossibleRoutsHelper(possibleRouts, selectedTowns, index + 1, distancesBetweenTowns)
        }
    }

    private fun getStartIterationIndex(index: Int, selectedTowns: IntArray): Int {
        return if (index == 0) 0
        else selectedTowns[index - 1] + 1
    }
}