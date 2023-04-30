class IpV4Converter {

    fun convertToIp(ip: UInt): String {
        val binary = convertToBinary(ip)
        val octets = splitIntoOctets(binary)
        val decimalOctets = convertToDecimal(octets)

        return decimalOctets.joinToString(".")
    }

    private fun convertToBinary(ip: UInt): String {
        return "%32s".format(ip.toString(2)).replace(' ', '0')
    }

    private fun splitIntoOctets(binary: String): Array<String> {
        return Array(4) { i -> binary.substring(i * 8, (i + 1) * 8) }
    }

    private fun convertToDecimal(octets: Array<String>): List<Int> {
        return octets.map { it.toInt(2) }
    }
}