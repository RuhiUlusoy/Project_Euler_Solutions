
fun main(args: Array<String>) {

    fun collatzSeq(num: Long) : Int {
        var number = num
        var count = 1
        while (number > 1){
            if (number % 2L == 0.toLong()) {
                number /= 2
                count++
            } else {
                number = 3*number+1
                count++
            }

        }

        return count
    }

    var max = 0
    var num2 = 0L

    for (i in 999999L downTo 1){
        if(collatzSeq(i)>max) {
            max = collatzSeq(i)
            num2 = i
        }
    }

    println("$num2 : contains $max terms")

  }