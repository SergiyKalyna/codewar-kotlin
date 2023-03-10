class Solution {

    /*
    Encrypt this!

    You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

    Your message is a string containing space separated words.
    You need to encrypt each word in the message using the following rules:
    The first letter must be converted to its ASCII code.
    The second letter must be switched with the last letter
    Keepin' it simple: There are no special characters in the input.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val encryptor = MessageEncryptor()
            val message = "A wise old owl lived in an oak"

            println(encryptor.encryptThis(message))
        }
    }
}