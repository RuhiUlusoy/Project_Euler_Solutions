import kotlin.math.sqrt

fun main(args: Array<String>) {

    //Returns a list of prime factors of an integer
    fun factorsOfNumber(number: Int) : List<Int>  {

        var num = number
        val factorsList : MutableList<Int> = mutableListOf()

        while (num % 2 == 0){
            num /= 2
            factorsList.add(2)
        }

        for (i in 3..num step 2){
            while (num % i == 0){
                num /= i
                factorsList.add(i)
            }
        }

        return factorsList
    }

    //Returns the number of positive divisors of an integer
    fun factorsCounts(number: Int) : Int  {
        val factorCountL : MutableList<Int> = mutableListOf()
        var count = 1

        for (i in factorsOfNumber(number) ){
            if (!factorCountL.contains(i)) {
                factorCountL.add(i)
            }
        }

        for (j in factorCountL){
            count *= factorsOfNumber(number).count{it == j} + 1
        }

        return count
    }

    //Returns the Triangular Number after the entered Triangular Number
    fun triNumber(num: Int) : Int{
        var next = 1 + (sqrt(1.0+(8.0 * num))).toInt()
        return num + (next/2)
    }

    var triangularNum = 1

    while (factorsCounts(triangularNum) < 500)
        triangularNum = triNumber(triangularNum)

    println(triangularNum)
}