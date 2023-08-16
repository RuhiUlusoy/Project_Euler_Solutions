import java.math.BigInteger

fun main(args: Array<String>) {

    fun Int.toBigInteger() = BigInteger.valueOf(toLong())

    var res : BigInteger = 1.toBigInteger()
    fun factorial(num:Int) : BigInteger{
        for (i in 2..num ) res *= i.toBigInteger()
        return res
    }

    var x = factorial(100).toString()
    var sum = 0
    for (i in 0..x.length-1) {
        sum += x[i].digitToInt()
    }

    println(sum)
  }
