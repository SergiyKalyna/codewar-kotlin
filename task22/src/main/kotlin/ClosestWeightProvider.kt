class ClosestWeightProvider {

    fun getClosestWeight(inputString: String): Array<IntArray> {
        val numbers = inputString.split(" ")

        if (isNumbersWeightZero(numbers)) return emptyArray()

        val numberWeightDataList = getNumberWeightsDataList(numbers)

        return numberWeightDataList
            .sortedWith(compareBy<NumberWeightData> { it.weight }
                .thenBy { it.positionIndex }
            )
            .take(2)
            .map { it.toWeightArray() }
            .toTypedArray()
    }

    private fun isNumbersWeightZero(numbers: List<String>): Boolean {
        return numbers.sumOf { it.toInt() } == 0
    }

    private fun getNumberWeightsDataList(numbers: List<String>): List<NumberWeightData> {
        val numberWeightsDataList = mutableListOf<NumberWeightData>()

        numbers.forEachIndexed { index, number ->
            val numberWeight = getNumberWeight(number)
            val numberWeightData = NumberWeightData(
                weight = numberWeight,
                positionIndex = index,
                originalValue = number.toInt()
            )

            numberWeightsDataList.add(numberWeightData)
        }

        return numberWeightsDataList
    }

    private fun getNumberWeight(number: String): Int {
        return number.map { it.toString().toInt() }.sum()
    }
}