fun main(args : Array<String>) {

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

   //Write prime numbers from 2 to 20
   var x = 20
    for (i in 2..x){
        if (checkPrime(i)){
            print("$i ")
        }
    }

}
