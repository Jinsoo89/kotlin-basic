fun main() {
    // if statement
    val a: Int = 1
    val b: Int = 5
    var max: Int

    max = if (a > b) {
        a
    } else {
        b
    }

    println("max num is: $max")

    // when statement
    val x: Int = 5
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    // for loop
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    for (num in numbers) {
        println(num)
    }

    // for loop using .withIndex()
    for ((index, value) in numbers.withIndex()) {
        println("index: $index, value: $value")
    }
}