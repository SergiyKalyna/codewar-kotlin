class GoldDivider {

    fun getBestDividing(gold: IntArray): Pair<Int, Int> {
        val arr = gold.clone()
        val sum = gold.sum()

        for (i in gold.indices.drop(1)) {
            for (j in 0 until gold.size - i) {
                arr[j] = maxOf(
                    gold[j] - arr[j + 1],
                    gold[j + i] - arr[j]
                )
            }
        }
        val firstPlayerAmount = (sum + arr.first()) / 2
        val secondPlayerAmount = sum - firstPlayerAmount
        return Pair(firstPlayerAmount, secondPlayerAmount)
    }
}