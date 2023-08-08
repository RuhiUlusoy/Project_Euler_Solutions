fun main(args : Array<String>) {

    fun factorial(number: Long){
        var result = 1L
        for(i in 1..number) result *=i
        println("$number! = $result")
    }

    var inputNum = 10L
    factorial(inputNum)
}