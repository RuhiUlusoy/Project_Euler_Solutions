fun main(args: Array<String>) {

    fun checkPrime(num:Int): Boolean{
        var control = true
        for (i in 2..num / 2) {
            if (num % i == 0) {
                control = false
                break
            }
        }
        if (control == true && (num > 1)) {
            return true
        } else {
            return false
        }
    }

    var sum = 0L

    for (i in 3..1999999 step 2){
        if (checkPrime(i)) sum +=i
    }

    println(sum+2)

}