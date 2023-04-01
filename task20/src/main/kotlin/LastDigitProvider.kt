import java.math.BigInteger

class LastDigitProvider {

    fun getLastDigit(base: BigInteger, exponent: BigInteger) = base.modPow(exponent, BigInteger.TEN).toInt()
}