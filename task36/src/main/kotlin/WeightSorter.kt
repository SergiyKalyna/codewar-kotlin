import WeightConverter.toWeight

class WeightSorter {

    fun orderWeight(inputString: String): String {
        if (inputString.isBlank()) return ""

        val weightList = inputString.split(" ").filter { it.isNotBlank() }
        val sortedWeightList = sortWeightList(weightList)

        return sortedWeightList.joinToString(separator = " ")
    }

    private fun sortWeightList(weightList: List<String>): List<String> {
        return weightList.map { it.toWeight() }
            .sortedWith(compareBy<Weight> { it.weight }
                .thenBy { it.textWeight })
            .map { it.textWeight }
    }
}