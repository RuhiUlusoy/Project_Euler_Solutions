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

    var num = 1
    var no = 0

    while (no<10001){
        if (checkPrime(num)) no++
        num++
    }

    println(num-1)
}