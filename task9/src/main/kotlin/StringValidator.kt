class StringValidator {

    fun checkValidString(inputString: String) {
        if (inputString.isBlank()) throw RuntimeException("Input string [$inputString] is not valid")
    }
}