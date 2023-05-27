class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(getValueFromEndlessNumbers(1L))
            println(getValueFromEndlessNumbers(2L))
            println(getValueFromEndlessNumbers(3L))
            println(getValueFromEndlessNumbers(100L))
            println(getValueFromEndlessNumbers(2100L))
            println(getValueFromEndlessNumbers(3100L))
        }

        private fun getValueFromEndlessNumbers(inputNumber: Long): Int {
            if (inputNumber == 1L) return 1

            val acceptableNumbers = getAcceptableNumbers(inputNumber)
            val searchNumber = inputNumber.toInt() - 1

            return acceptableNumbers[searchNumber]
        }

        private fun getAcceptableNumbers(inputNumber: Long): List<Int> {
            val numbers = mutableListOf<Int>()
            numbers.add(1)

            for (iteration in 2 .. inputNumber) {
                val increasedList = getIncreasedList(iteration.toInt())

                numbers += increasedList
            }

            return numbers
        }

        private fun getIncreasedList(lastElement: Int): List<Int> {
            val increasedList = mutableListOf<Int>()

            for (index in 1..lastElement) {
                if (index > 9) {
                    increasedList += convertToDigits(index)
                } else increasedList.add(index)
            }

            return increasedList
        }

        private fun convertToDigits(value: Int): List<Int> {
            val digits = mutableListOf<Int>()

            var num = value
            while (num > 0) {
                digits.add((num % 10))
                num /= 10
            }

            return digits.reversed()
        }
    }
}