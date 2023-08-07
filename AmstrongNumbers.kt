fun main(args : Array<String>) {

    fun checkArmstrongNumber(num: Int){
        var sub = 0
        var number = num

        while (number!=0){

            var multply = 1
            for (i in 1..num.toString().length){
                multply *= number%10
            }
            sub += multply
            number /=10
        }

        if (sub == num){
            println("$num is an Armstrong Number")
        } else{
            println("$num is not an Armstrong Number")
        }
    }

    checkArmstrongNumber(1634)
}
