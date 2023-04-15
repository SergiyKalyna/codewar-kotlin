class Solution {

    /*
       I have a string with wrong directed paranthesis, I want to replace ( with ) and ) with (
       and <** with **> and > with **<** and **{** with **}** and **}** with **{** at same time,
       you should do it with a single **replace** method.
        For example I have this string : You }}need{{ >extra< time ) or money (
        Which should be like this : You {{need}} <extra> time ( or money )

        You shouldn't use split.

        Since this is a code golf, you should write only one line of code, and less than 95 characters.
        Empty lines are ignored so don't worry.
    */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(getFixedString("You }}need{{ >extra< time ) or money ("))
        }

        private fun getFixedString(incorrectSting: String): String {
            return Regex("[{}<>()]").replace(incorrectSting) { "{}<>()"["}{><)(".indexOf(it.value)].toString() }
        }
    }
}