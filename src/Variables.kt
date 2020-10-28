fun main() {
    val a: Int = 10000
    val d: Double = 100.0
    val f: Float = 100.0f
    val l: Long = 100000000000
    val s: Short = 10
    val b: Byte = 1

    println(a)
    println(d)
    println(f)
    println(l)
    println(s)
    println(b)

    // Character
    val letter: Char
    letter = 'A'
    println(letter)

    // Boolean
    val bool: Boolean
    bool = true
    println(bool)

    // String
    val str: String = "I am String"
    println(str)

    // Array
    val nums: IntArray = intArrayOf(1, 2, 3)
    println(nums)

    // Collections
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    val readOnlyNumbers: List<Int> = listOf(1, 2, 3)
    println(numbers)
    println(readOnlyNumbers)

    val firstNum = numbers.first()
    val lastNum = numbers.last()
    val evenNum = numbers.filter { it % 2 == 0 }
    println(firstNum)
    println(lastNum)
    println(evenNum)

    // Range
    for (i in 0..5) // from 0 to 5 inclusive
        println(i)
}