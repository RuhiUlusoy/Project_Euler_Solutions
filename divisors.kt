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

    //Returns a list of positive divisors of an integer
    fun divisorsOfNumber(num: Int) : MutableList<Int> {
        val factors = mutableListOf<Int>()
        if (num < 1)
            return factors
        (1..num / 2)
            .filter { num % it == 0 }
            .forEach { factors.add(it) }
        factors.add(num)
        return factors
    }

    println("Prime factors of 120 = ${factorsOfNumber(120)}")

    println("Number of positive divisors of 120 : ${factorsCounts(120)}")

    println("Positive divisors of 120 : ${divisorsOfNumber(120)}")
}