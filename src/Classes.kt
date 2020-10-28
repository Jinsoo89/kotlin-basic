class Classes {
    // Inner class
    class InnerClass {
        fun innerFun(): String {
            return "This is an inner class"
        }
    }

    private var name: String = "class"

    override fun toString(): String {
        return "This is a $name"
    }
}

interface Animal {
    fun eat()
}

fun main() {
    val classObj = Classes()
    println(classObj.toString())
    println(Classes.InnerClass().innerFun())

    // Anonymous inner class
    var tiger: Animal = object:Animal {
        override fun eat() {
            println("This animal eats something")
        }
    }
    tiger.eat()
}