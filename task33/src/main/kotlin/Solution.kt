class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val atomsCounter = AtomsCounter()

            val formula1 = "H2O"
            val formula2 = "Mg(OH)2"
            val formula3 = "K4[ON(SO3)2]2"

            println(atomsCounter.getAtoms(formula1))
            println(atomsCounter.getAtoms(formula2))
            println(atomsCounter.getAtoms(formula3))
        }
    }
}