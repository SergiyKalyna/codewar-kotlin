class Solution {

    /*
    he function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n)
    and returns the total perimeter of all the squares.

    perimeter(5)  should return 80
    perimeter(7)  should return 216
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val rectanglePerimeterProvider = RectanglePerimeterProvider()

            println(rectanglePerimeterProvider.getRectanglePerimeter(5))
            println(rectanglePerimeterProvider.getRectanglePerimeter(7))
        }
    }
}