
fun main(args: Array<String>) {

    // Math Solution = (2*num)!/(num!*num!)

    fun solution1(num:Long): Long{
        var result = 1L
        for(i in 1..num){
            result = result * (num + i) / i
        }

        return result
    }

    println(solution1(20L))

   
    //Second Solution

    fun solution2(num:Int): Int{
        val rows = num
        val cols = num

        val arr : Array<IntArray> = Array(rows) { IntArray(cols) }

        for (i in 0..num-1) {
            arr[0][i] = 1
        }

        for (m in 1..num-1) {
            for (n in 0..num-1) {
                if (n == 0) {
                    arr[m][n] = 1
                } else {
                    arr[m][n] = arr[m][n - 1] + arr[m - 1][n]
                }
            }
        }

        for (row in arr) {
            println(row.contentToString())
        }

        return arr[num-1][num-1]
    }

    println(solution2(4))

  }
