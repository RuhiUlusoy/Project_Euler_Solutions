fun main(args: Array<String>) {

    var sum1 = 0
    var sum2 = 0

    for (i in 1..100){
        sum1 += i*i
        sum2 += i
    }

    println("${sum2*sum2 - sum1}")

}