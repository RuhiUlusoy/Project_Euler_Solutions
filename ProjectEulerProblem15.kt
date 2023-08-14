
fun main(args: Array<String>) {

    // Math Solution = (2*num)!/(num!*num!)

    fun solution(num:Long): Long{
        var result = 1L
        for(i in 1..num){
            result = result * (num + i) / i
        }

        return result
    }

    println(solution(20L))

  }