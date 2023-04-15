class Solution {

    /*
    In this kata we want to find all integers x, y (x >= 0, y >= 0) solutions of a diophantine equation of the form:
    x2 - 4 * y2 = n
    (where the unknowns are x and y, and n is a given positive number) in decreasing order of the positive xi.

    If there is no solution return [] or "[]" or "".
    Examples:
    solEquaStr(90005) --> "[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]"
    solEquaStr(90002) --> "[]"
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val diophantineEquationSolver = DiophantineEquationSolver()

            println(diophantineEquationSolver.countEquation(12))
            println(diophantineEquationSolver.countEquation(13))
            println(diophantineEquationSolver.countEquation(90005))
            println(diophantineEquationSolver.countEquation(90002))
        }
    }
}