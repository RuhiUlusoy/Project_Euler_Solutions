fun main(args: Array<String>) {

    for (a in 1..334){
        for (b in 2..500){
            if (a*a+b*b==(1000-a-b)*(1000-a-b) && a<b && b<(1000-a-b)) println(a*b*(1000-a-b))
        }
    }

}