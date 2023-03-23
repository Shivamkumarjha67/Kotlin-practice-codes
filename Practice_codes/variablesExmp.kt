val PI = 3.144
var x : Int = 79

fun increment() {
    x += 1;
}

fun basic() {
    // Generally Local keyword is declared using the variable "val". And assigned once only.

    val a : Int = 20 // Immediate assignment.
    val b = 2 // Int type is inferred or unexpressed.
    val c : Int // Type required when no initializer is expressed.
    c = 30 // deferred assisgnment.

    println("value of a : $a , b : $b and c : $c")
}

fun basic1() {
    // variable declared as "var" can be reassigned multiple times.

    var a : Int = 45;
    println("Value of a is : $a")
    a = 90
    println("Value of a is : $a")
}

fun main() {
    basic()
    basic1()

    println("Value of PI : $PI and x : $x")

    increment()
    println("Value of x is : $x")

    var y = 49
    println("Value of y + 1 is : ${y+1}")
}