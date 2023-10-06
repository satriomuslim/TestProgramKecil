fun main() {
    val numbers = (1..100).toList()

    for (i in 99 downTo 0) {
        val number = numbers[i]
        val isPrime = isPrime(number)

        if (!isPrime) {
            val result = when {
                number % 3 == 0 && number % 5 == 0 -> "FooBar"
                number % 3 == 0 -> "Foo"
                number % 5 == 0 -> "Bar"
                else -> number.toString()
            }
            print("$result ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    if (num <= 3) return true
    if (num % 2 == 0 || num % 3 == 0) return false

    var i = 5
    while (i * i <= num) {
        if (num % i == 0 || num % (i + 2) == 0) return false
        i += 6
    }

    return true
}