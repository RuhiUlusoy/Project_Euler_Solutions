fun generatePermutations(input: String): List<String> {
    val permutations = mutableListOf<String>()
    generatePermutationsHelper(input.toCharArray(), 0, permutations)
    return permutations
}

fun generatePermutationsHelper(input: CharArray, index: Int, permutations: MutableList<String>) {
    if (index == input.size - 1) {
        permutations.add(String(input))
        return
    }

    for (i in index until input.size) {
        swap(input, index, i)
        generatePermutationsHelper(input, index + 1, permutations)
        swap(input, index, i) // Backtracking step
    }
}

fun swap(input: CharArray, i: Int, j: Int) {
    val temp = input[i]
    input[i] = input[j]
    input[j] = temp
}

fun main() {
    val input = "0123456789"
    val permutations = generatePermutations(input).sorted()
    println(permutations[999999])
}