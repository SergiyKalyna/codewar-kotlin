data class PrimeFactor(
    val prime: Int,
    var exponent: Int = 1
){
    fun incrementExponent() {
        exponent++
    }

    override fun toString(): String {
        return if (exponent == 1) "$prime" else "$prime^$exponent"
    }
}
