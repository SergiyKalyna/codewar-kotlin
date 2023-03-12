class EqualSidesOfAnArray {

    fun findEvenIndex(arr: IntArray): Int {
        if (arr.isEmpty()) return 0

        var sumLeft = 0
        var sumRight = arr.sum()

        arr.indices.forEach { index ->
            sumRight -= arr[index]

            if (sumLeft == sumRight) {
                return index
            }

            sumLeft += arr[index]
        }

        return -1
    }
}