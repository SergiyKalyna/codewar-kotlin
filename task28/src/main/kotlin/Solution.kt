class Solution {

    /*
    Write a function dirReduc which will take an array of strings and returns an array of strings with the needless
    directions removed (W<->E or S<->N side by side).

    The Haskell version takes a list of directions with data Direction = North | East | West | South.
    The Clojure version returns nil when the path is reduced to nothing.
    The Rust version takes a slice of enum Direction {North, East, West, South}.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val directionReductionProvider = DirectionReductionProvider()
            val inputDirection = arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")

            val result = directionReductionProvider.getReducingDirection(inputDirection)

            result.forEach { println(it) }
        }
    }
}