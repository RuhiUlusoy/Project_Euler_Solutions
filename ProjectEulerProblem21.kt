
fun main(args: Array<String>) {

    //Returns a list of positive divisors of an integer
    fun divisorsOfNumber(num: Int) : MutableList<Int> {
        val factors = mutableListOf<Int>()
        if (num < 1)
            return factors
        (1..num / 2)
            .filter { num % it == 0 }
            .forEach { factors.add(it) }

        return factors
    }

    fun sumOfDivisors(num: Int) : Boolean {
        var sumDiv1 = 0
        var sumDiv2 = 0
        for (i in divisorsOfNumber(num)){
            sumDiv1 += i
        }

        for (j in divisorsOfNumber(sumDiv1)){
            sumDiv2 += j
        }

        if (sumDiv2 == num && sumDiv1 != num) return true
        else return false
    }

    val amicableList = mutableListOf<Int>()
    for (i in 2..9999){
        if (sumOfDivisors(i)) amicableList.add(i)
    }

    var sum = 0
    for (i in amicableList) sum += i

    println(sum)


  }
