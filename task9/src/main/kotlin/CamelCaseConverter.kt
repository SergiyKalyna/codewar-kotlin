class CamelCaseConverter {

    fun toCamelCase(str: String): String {
        val stringWords = str.split("-", "_")

        return if (isFirstWordStartWithUpperCase(stringWords[0])) {
            toCamelCaseWithCapitalizedFirstLetter(stringWords)
        } else {
            toCamelCaseWithoutCapitalizedFirstLetter(stringWords)
        }
    }

    private fun isFirstWordStartWithUpperCase(word: String): Boolean {
        return word[0].isUpperCase()
    }

    private fun toCamelCaseWithCapitalizedFirstLetter(words: List<String>): String {
        var camelCaseWord = ""
        words.forEach { word ->
            camelCaseWord += word.replaceFirstChar { it.uppercase() }
        }

        return camelCaseWord
    }

    private fun toCamelCaseWithoutCapitalizedFirstLetter(words: List<String>): String {
        var camelCaseWord = ""
        camelCaseWord += words[0].replaceFirstChar { it.lowercase() }

        for (wordNumber in 1 until words.size) {
            camelCaseWord += words[wordNumber].replaceFirstChar { it.uppercase() }
        }

        return camelCaseWord
    }
}