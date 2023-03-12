class MessageEncryptor {

    fun encryptThis(message: String): String {
        val messageWords = message.split(" ")
        val encryptedWords = mutableListOf<String>()

        messageWords.forEach { word ->
            encryptedWords.add(encryptWord(word))
        }

        return encryptedWords.joinToString(" ")
    }

    private fun encryptWord(word: String): String {
        val encodeFirstLetterByAscii = word[0].code

        if (word.length < 2) {
            return encodeFirstLetterByAscii.toString()
        }

        val wordWithReplacedSecondAndLastChar = replaceSecondWithLastChar(word)

        return encodeFirstLetterByAscii.toString() + wordWithReplacedSecondAndLastChar.removeRange(0, 1)
    }

    private fun replaceSecondWithLastChar(word: String): String {
        if (word.length == 2) {
            return word
        }

        val secondChar = word[1]
        val lastChar = word.last()
        val replaced = word.replaceRange(1, 2, lastChar.toString())
        return replaced.replaceRange(word.length - 1, word.length, secondChar.toString())
    }
}