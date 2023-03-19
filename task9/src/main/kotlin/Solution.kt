import java.io.BufferedReader
import java.io.InputStreamReader

class Solution {

    /*
    Complete the method/function so that it converts dash/underscore delimited words into camel casing.
    The first word within the output should be capitalized only if the original word was capitalized
    (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
     */

    companion object {
        @JvmStatic
        fun main(array: Array<String>) {
            val validator = StringValidator()
            val camelCaseConverter = CamelCaseConverter()
            val reader = BufferedReader(InputStreamReader(System.`in`))

            val inputString = reader.readLine()
            reader.close()

            validator.checkValidString(inputString)

            val result = camelCaseConverter.toCamelCase(inputString)

            println(result)
        }
    }
}