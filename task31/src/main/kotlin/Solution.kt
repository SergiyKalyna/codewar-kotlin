class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val pinsEncoder = PinsEncoder()

            val observedCode1 = "8"
            val observedCode2 = "11"
            val observedCode3 = "369"

            val encodedPin1 = pinsEncoder.getPINs(observedCode1)
            val encodedPin2 = pinsEncoder.getPINs(observedCode2)
            val encodedPin3 = pinsEncoder.getPINs(observedCode3)


            println(encodedPin1.joinToString())
            println(encodedPin2.joinToString())
            println(encodedPin3.joinToString())
        }
    }
}