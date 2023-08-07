fun main(args : Array<String>) {
    var sum0 = 1
    var sum1 = 1
    for(i in 1..20){
        if (i == 1 || i == 2){
            println("F$i = $sum0 ")
        }
        else{
          var sum2 = sum0 + sum1
          println("F$i = $sum2 ")
          sum0 = sum1
          sum1 = sum2
        }
    }
}
