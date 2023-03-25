class Solution {

    /*
    In this kata you have to correctly return who is the "survivor", ie: the last element of a Josephus permutation.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val survivorDefiner = SurvivorDefiner()

            println(survivorDefiner.josephusSurvivor(11,19))
        }
    }
}