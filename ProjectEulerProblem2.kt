fun main(args: Array<String>) {
    var sum0 = 1
    var sum1 = 1
    var sum2 : Int
    var sum3 = 0

    while(sum3<=4000000){
        sum2 = sum0 + sum1
        if (sum2%2==0) sum3 +=sum2
        sum0 = sum1
        sum1 = sum2
    }
    println(sum3)
}