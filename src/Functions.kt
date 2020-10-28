fun main() {
    println(sum(1, 2))
    println(sumSimple(1, 2))
    printSum(5, 5)

    println(multiply())
    println(multiply(2))

    nothingToReturn()
    returnNothing()

    println(sumAll(1, 2, 3, 4, 5))

    println(factorial(5))

    print(filterInt())
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumSimple(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

// default parameter values
fun multiply(a: Int = 1, b: Int = 1): Int {
    return a * b
}

// void return type
fun nothingToReturn(): Unit {
    println("Use 'Unit' as return type for the function")
}

fun returnNothing() {
    println("'Unit' return type can be omitted")
}

// variable number of arguments
fun sumAll(vararg values: Int): Int {
    return values.sum()
}

// recursion
fun factorial(num: Int): Int {
    return if (num == 1) {
        num
    } else {
        return num * factorial(num - 1)
    }
}

// anonymous function
fun filterInt(): List<Int> {
    val values = intArrayOf(-2, -1, 0, 1, 2, 3, 4)
    // anonymous fun()
    return values.filter(fun(it) = it % 2 == 0)
}