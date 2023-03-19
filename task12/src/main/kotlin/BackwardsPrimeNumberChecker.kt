class BackwardsPrimeNumberChecker {

    fun backwardsPrime(start: Long, end: Long): String {
        return (start..end).asSequence()
            .filterNot { it == it.reversed() }
            .filter { it.reversed().isPrime() }
            .filter { it.isPrime() }
            .joinToString(" ")
    }

    private fun Long.isPrime(): Boolean {
        for (number in 2 until this) {
            if (number * number > this) return true
            if (this % number == 0L) return false
        }

        return true
    }

    private fun Long.reversed(): Long = this.toString()
        .reversed()
        .toLong()
}