class HexStringConverter {

    fun convertHexStringToRGB(hexString: String): RGB {
        val cleanedHexString = hexString.replace("#", "")

        return getRgb(cleanedHexString)
    }

    private fun getRgb(cleanedHexString: String): RGB{
        val redHex = cleanedHexString.substring(0, 2)
        val greenHex = cleanedHexString.substring(2, 4)
        val blueHex = cleanedHexString.substring(4, 6)

        val red = redHex.toInt(16)
        val green = greenHex.toInt(16)
        val blue = blueHex.toInt(16)

        return RGB(red, green, blue)
    }
}