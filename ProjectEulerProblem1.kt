fun main(args: Array<String>) {
    var sum = 0
    for (i in 3..999){
        if (i%3==0) sum +=i

        if (i%5==0) sum +=i

        if(i%15==0) sum -=i
    }
    print(sum)
}