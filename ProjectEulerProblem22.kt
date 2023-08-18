import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {

    val inputStream: InputStream = File("names.txt").inputStream()
    val inputString = inputStream.bufferedReader().use { it.readText() }
    val namesList : List<String> = inputString.split(",").map { it.trim() }
      
    val letterList : List<String> = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")

    var total = 0
    var nameScore : Int
    var multply : Int
    var sum : Int

    for(i in namesList.sorted()){
        sum = 0
        for(j in i) {
            nameScore = letterList.indexOf(j.toString())+1
            sum += nameScore
        }
        multply = sum * (namesList.sorted().indexOf(i)+1)
        total += multply
    }

    println(total)

  }
