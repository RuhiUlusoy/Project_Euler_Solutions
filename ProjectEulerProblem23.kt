
fun main(args: Array<String>) {

    fun abundantNumbers (num: Int) : Boolean{
        var sum = 1
        for(i in 2..num/2) {
            if (num % i == 0) sum +=i
        }
        return (sum > num)
    }

    val abundantList : MutableList<Int> = mutableListOf()
    for (j in 1..28123){
        if (abundantNumbers(j)) abundantList.add(j)
    }

    val sumAbundantList : MutableList<Int> = mutableListOf()
    for(m in abundantList){
        for(n in abundantList){
            if (m + n <= 28123 && !sumAbundantList.contains(m + n)) sumAbundantList.add(m + n)
        }
    }

    var total = (1..28123).sum()
    println(total-sumAbundantList.sum())

  }
