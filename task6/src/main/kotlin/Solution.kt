class Solution {

    /*
    You are going to be given an array of integers. Your job is to take that array and find an index N where the sum
    of the integers to the left of N is equal to the sum of the integers to the right of N.
    If there is no index that would make this happen, return -1.
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val equalSidesOfAnArray = EqualSidesOfAnArray()

            val arr1 = intArrayOf(1, 2, 3, 4, 3, 2, 1)
            val arr2 = intArrayOf(1, 100, 50, -51, 1, 1)
            val arr3 = intArrayOf(20, 10, -80, 10, 10, 15, 35)

            println(equalSidesOfAnArray.findEvenIndex(arr1)) // Output: 3
            println(equalSidesOfAnArray.findEvenIndex(arr2)) // Output: 1
            println(equalSidesOfAnArray.findEvenIndex(arr3)) // Output: 0
        }
    }
}