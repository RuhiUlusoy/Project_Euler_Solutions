fun main(args : Array<String>) {
    //Least Common Multiple
    fun findLCM(arrLCM: Array<Int>): Int{
        var lcm : Int
        var max = arrLCM.max()
        lcm = max
        while(true){
            var stop = true
            for (i in arrLCM){
                if (lcm%i!=0){
                    lcm += max
                    stop = false
                    break
                }
            }
            if (stop) break
        }
        return lcm
    }

    //Greatest Common Divisor
    fun findGCD(arrGCD: Array<Int>) : Int{
        var gcd = 1

        for(i in 2..arrGCD.min()){
            var find = true
            for(j in arrGCD){
                if(j%i!=0) {
                    find = false
                    break
                }
            }
            if (find) gcd = i
        }
        return gcd
    }

    val arr = arrayOf(5,15,10)
    println("GCD = ${findGCD(arr)}")
    println("LCM = ${findLCM(arr)}")
}