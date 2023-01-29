class Solution {
    /*
    Return an array containing the numbers from 1 to N, where N is the parametered value.

    Replace certain values however if any of the following conditions are met:

    If the value is a multiple of 3: use the value "Fizz" instead
    If the value is a multiple of 5: use the value "Buzz" instead
    If the value is a multiple of 3 & 5: use the value "FizzBuzz" instead
    N will never be less than 1.
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            fizzBuzz(15).forEach(System.out::println)
        }

        private fun fizzBuzz(inputNumber: Int): Array<String> {
            checkValidInput(inputNumber)

//            val convertedValues = Array(inputNumber + 1) { "" }
//            for (i in 1..inputNumber) {
//                convertedValues[i] = convertValue(i)
//            }
//
//            return convertedValues.filterNot { it.isBlank() }.toTypedArray()

            return (1..inputNumber).map { convertValue(it) }.toTypedArray()
        }

        private fun checkValidInput(inputNumber: Int) {
            if (inputNumber < 1) throw RuntimeException("Input data should not be less than 1")
        }

        private fun convertValue(number: Int): String {
            return when {
                number % 15 == 0 -> "FizzBuzz"
                number % 3 == 0 -> "Fizz"
                number % 5 == 0 -> "Buzz"
                else -> number.toString()
            }
        }
    }
}