fun findPrimeFactors(number: Int): List<Int> {
    var n = number
    val primeFactors = mutableListOf<Int>()

    // Handle the case of even numbers
    while (n % 2 == 0) {
        primeFactors.add(2)
        n /= 2
    }

    // Check for odd prime factors
    var factor = 3
    while (factor * factor <= n) {
        if (n % factor == 0) {
            primeFactors.add(factor)
            n /= factor
        } else {
            factor += 2
        }
    }

    // If n is a prime number greater than 2
    if (n > 2) {
        primeFactors.add(n)
    }

    return primeFactors
}

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number > 0) {
        val primeFactors = findPrimeFactors(number)
        println("Prime factors of $number are: $primeFactors")
    } else {
        println("Invalid input! Please enter a positive integer.")
    }
}