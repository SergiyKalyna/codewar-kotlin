class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ipConverter = IpV4Converter()

            println(ipConverter.convertToIp(2154959208u))
            println(ipConverter.convertToIp(0u))
            println(ipConverter.convertToIp(32u))
        }
    }
}