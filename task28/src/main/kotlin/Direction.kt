enum class Direction (){
    NORTH,
    SOUTH,
    EAST,
    WEST;

    companion object {
        fun Direction.opposite(): Direction {
            return when (this) {
                NORTH -> SOUTH
                SOUTH -> NORTH
                EAST -> WEST
                WEST -> EAST
            }
        }
    }
}