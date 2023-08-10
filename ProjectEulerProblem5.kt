fun main(args: Array<String>) {

    //Least Common Multiple
    fun findLCM(arrLCM: IntArray): Int{
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

    val arr = IntArray(20) { it * 1+1 }
    println("LCM = ${findLCM(arr)}")
}