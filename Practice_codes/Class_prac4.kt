// Default Constructor is being called whenever object is declared.
class KotlinBasic {
    var value = 10

    // fun sum(a : Int, b : Int) = a+b
    fun sum(a : Int, b : Int) : Int {
        return a+b;
    }
}

// Parameterized constructor is being called whenever object is created.
// Using constructor keyword we can also declare.
class KotlinBasic_1 constructor(a : Int) {

    // "init" - Block is used when any task is compulsory to perform as soon as object is declared.
    init {
        println("a is given as : $a")
    }

    val value = 50
}

fun main() {
    val obj = KotlinBasic()
    println("Value is  : ${obj.value}")
    println("Sum is : ${obj.sum(10,20)}")

    // Without object we can direcly get the attributes of the class. But it is not the recommended way.
    println("Value is : " + KotlinBasic().value)
    println("Sum is : " + KotlinBasic().sum(50,20))

    // -----------------------------------------------
    val obj1 = KotlinBasic_1(9)
    println("Value is : ${obj1.value}")
}