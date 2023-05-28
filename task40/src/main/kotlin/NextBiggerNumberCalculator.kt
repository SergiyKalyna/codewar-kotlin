import utils.DigitReverser
import utils.DigitSwapper
import utils.DigitsConverter

class NextBiggerNumberCalculator(
    private val swapIndexFinder: SwapIndexFinder,
    private val smallestGreaterIndexFinder: SmallestGreaterIndexFinder
) {

    fun calculateNextBiggerNumber(inputNumber: Long): Long {
        val digits = DigitsConverter.toDigitsArray(inputNumber)

        val swapIndex = swapIndexFinder.findSwapIndex(digits)
        if (swapIndex < 0) {
            return -1
        }

        val smallestGreaterIndex = smallestGreaterIndexFinder.findSmallestGreaterIndex(digits, swapIndex)

        DigitSwapper.swapDigits(digits, swapIndex, smallestGreaterIndex)
        DigitReverser.reverseDigitsAfterIndex(digits, swapIndex)

        return DigitsConverter.toLong(digits)
    }
}