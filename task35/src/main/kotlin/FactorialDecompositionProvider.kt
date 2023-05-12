class FactorialDecompositionProvider {

    fun getDecomposeResult(factorial: Int): String {
        val primeFactors = mutableListOf<PrimeFactor>()
        for (number in 2..factorial) {
            decomposeNumberIntoPrimeFactors(number, primeFactors)
        }
        return primeFactors.joinToString(" * ")
    }

    private fun decomposeNumberIntoPrimeFactors(number: Int, primeFactors: MutableList<PrimeFactor>) {
        var remainingNumber = number
        var index = 0
        while (primeFactors.size > index && primeFactors[index].prime <= remainingNumber) {
            val currentPrimeFactor = primeFactors[index]
            if (remainingNumber % currentPrimeFactor.prime == 0) {
                remainingNumber /= currentPrimeFactor.prime
                currentPrimeFactor.incrementExponent()
            } else {
                index++
            }
        }
        if (remainingNumber > 1) {
            primeFactors.add(PrimeFactor(remainingNumber))
        }
    }
}