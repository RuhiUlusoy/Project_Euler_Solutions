fun main(args: Array<String>) {
    var num : Int
    var max = 1

    fun findPalindromeNumber(number: Int) : Boolean{
        var numberStr = number.toString()
        var check = true

        for (i in 0..numberStr.length / 2-1) {
            if (numberStr.get(i) != numberStr.get(numberStr.length - i - 1) ){
                check = false
                break
            }
        }
        return check
    }

    for(i in 999 downTo 100){
        for(j in 999 downTo 100){
            num = i*j
            if(findPalindromeNumber(num) && num>max) {
                max = num
                break
            }
        }
    }
    
    println("$max")
}