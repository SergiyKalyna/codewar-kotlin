class Solution {

    /*
    Your task, is to create N×N multiplication table, of size provided in parameter.
     */

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            multiplicationTable(3)
                .forEach {
                    println(it.forEach { value ->
                        print(value)
                    })
                }
        }

        private fun multiplicationTable(size: Int): Array<IntArray> {
            if (size <= 0) return emptyArray()

            val multiplicationTable = mutableListOf<IntArray>()

            for (row in 1..size) {
                val rowMultiplications = mutableListOf<Int>()
                for (column in 1..size) {
                    rowMultiplications.add(row * column)
                }
                multiplicationTable.add(rowMultiplications.toIntArray())
            }

            return multiplicationTable.toTypedArray()
        }
    }
}