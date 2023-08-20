import java.math.BigInteger

fun main() {

    fun Int.toBigInteger() = BigInteger.valueOf(toLong())

    var sum0 : BigInteger = 1.toBigInteger()
    var sum1 : BigInteger = 1.toBigInteger()
    var sum2 = sum0 + sum1
    var i = 3

    while (sum2.toString().length<=1000){
        sum2 = sum0 + sum1
        if (sum2.toString().length==1000){
            println("F$i = $sum2 ")
            break
        }
        i++
        sum0 = sum1
        sum1 = sum2
    }
}