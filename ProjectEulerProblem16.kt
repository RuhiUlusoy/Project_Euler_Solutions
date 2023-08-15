
fun main(args: Array<String>) {
    // The following function is written for the recursive function.
    // It has nothing to do with the solution.

    fun powerDigit(num: Int, pow: Int) : Int{
        if (pow == 0) return 1
        if (pow == 1) return num
        var num1 = num
        var pow1 = pow
        var res = num1 * powerDigit(num1, pow1 - 1)
        return res
    }

    println(powerDigit(2,30))

    // The solution starts from here

    var digitList: MutableList<Int> = mutableListOf(8,6,7,2,3)
    var digitList2: MutableList<Int> = mutableListOf()

    var  k = 0

    for (i in 16..1000 ) {
        for (j in 0..digitList.size - 1){
            if (j==0) {
                digitList2.add((2*digitList[j])%10)
                k = (2*digitList[j])/10
            }
            else if (j in 1..digitList.size - 2)  {
                digitList2.add((2*digitList[j]+k)%10)
                k = (2*digitList[j])/10
            }
            else {
                if(2*digitList[j]+k>9){
                    digitList2.add((2*digitList[j]+k)%10)
                    digitList2.add((2*digitList[j]+k)/10)
                } else digitList2.add((2*digitList[j]+k))
            }
        }
        digitList.clear()
        for ( m in digitList2) digitList.add(m)
        digitList2.clear()
    }

    var sum = 0

    for(i in digitList) sum += i

    println(sum)
  }
