class SurvivorDefiner {

    fun josephusSurvivor(quantity: Int, stepLength: Int): Int {
        checkValidOfInputNumbers(quantity, stepLength)

        val numbers = MutableList(quantity) { it + 1 }
        var currentIndex = 0

        while (numbers.size != 1) {
            currentIndex = (currentIndex + stepLength -1) % numbers.size
            numbers.removeAt(currentIndex)

            if (currentIndex == numbers.size) currentIndex = 0
        }

        return numbers.first()
    }

    private fun checkValidOfInputNumbers(quantity: Int, stepLength: Int) {
        if (quantity <= 0 || stepLength <= 0) throw RuntimeException("Input numbers are not valid")
    }
}