fun main(args : Array<String>) {

    fun perfectNumber(number: Int): Boolean {
        var sum = 1
        var num = number
        var result : Boolean
        for(i in 2..number/2){
            if (number%i==0){
               sum +=i
               num /=i
            }
        }

        if(sum==number){
            result = true
        }
        else{
            result = false
        }
        return result
    }

    var inputNum = 5

    if(perfectNumber(inputNum)){
        println("$inputNum is a Perfect Number")
    }
    else {println("$inputNum is not a Perfect Number")
    }

}