class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val timeFormatter = TimeFormatter()

            println(timeFormatter.formatDuration(62))
            println(timeFormatter.formatDuration(3662))
            println(timeFormatter.formatDuration(24234))
            println(timeFormatter.formatDuration(13124141))
        }
    }
}