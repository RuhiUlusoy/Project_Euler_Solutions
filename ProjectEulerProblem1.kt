fun main(args: Array<String>) {
    var sum = 0
    for (i in 3..999){
        if (i%3==0 || i%5==0) sum +=i
    }
    print(sum)
}