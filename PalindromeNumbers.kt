fun main(args : Array<String>) {

    fun findPalindromeNumber(number: Int){
        var numberStr = number.toString()
        var check = true

        for (i in 0..numberStr.length / 2-1) {
            if (numberStr.get(i) != numberStr.get(numberStr.length - i - 1) ){
                    check = false
                    break
            }
        }

        if(check){
            println("$number is Palindrome")
        } else{
            println("$number is not Palindrome")
        }
    }

    findPalindromeNumber(12321)
}