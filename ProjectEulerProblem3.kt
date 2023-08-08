fun main(args: Array<String>) {
    var num = 600851475143
    var max = 3L

    while(num>1){
        if(num%max==0L){
            num /= max
            max = max
        } else max +=2
    }

    println(max)
}