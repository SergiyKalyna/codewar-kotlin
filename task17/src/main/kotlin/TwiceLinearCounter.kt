class TwiceLinearCounter {

    internal fun countLinear(inputValue: Int): Int {
        val numbers = mutableListOf<Int>()

        if (inputValue == 0) return 1

        numbers.add(1)

        for (iteration in 0..inputValue) {
            val valueX = numbers[iteration]

            numbers.add(getValueY(valueX))
            numbers.add(getValueZ(valueX))

            numbers.sort()
        }

        return numbers.distinct()[inputValue]
    }

    private fun getValueY(valueX: Int): Int {
        return 2 * valueX + 1
    }

    private fun getValueZ(valueX: Int): Int {
        return 3 * valueX + 1
    }
}