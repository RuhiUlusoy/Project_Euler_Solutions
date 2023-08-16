fun main(args: Array<String>) {

    var triangle = arrayOf(
        arrayOf(75),
        arrayOf(95, 64),
        arrayOf(17, 47, 82),
        arrayOf(18, 35, 87, 10),
        arrayOf(20,  4, 82, 47, 65),
        arrayOf(19,  1, 23, 75,  3, 34),
        arrayOf(88,  2, 77, 73,  7, 63, 67),
        arrayOf(99, 65,  4, 28,  6, 16, 70, 92),
        arrayOf(41, 41, 26, 56, 83, 40, 80, 70, 33),
        arrayOf(41, 48, 72, 33, 47, 32, 37, 16, 94, 29),
        arrayOf(53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14),
        arrayOf(70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57),
        arrayOf(91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48),
        arrayOf(63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31),
        arrayOf(4, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23))

    for (row in triangle.size - 2 downTo 0) {
        for (col in triangle[row].indices) {
            triangle[row][col] += maxOf(triangle[row + 1][col], triangle[row + 1][col + 1])
        }
    }

    val result = triangle[0][0]
    println(result)
}



