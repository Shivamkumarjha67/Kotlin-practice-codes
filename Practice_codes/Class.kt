// For inheriting class it must be declared open. Because class are by default final. So, inorder to inherit we 
// need to make it open.

open class Shape() {
    var weight = 45
}

class Rectangle(var height : Double , var length : Double) : Shape() {
    var perimeter = (height + length) * 2;
}

fun main() {
    val a = 20.2
    val b = 40.1

    // Object creation.

    var obj = Rectangle(a,b)

    println("Perimenter of rectangle is (a+b)*2 : ${obj.perimeter}")
    println("Weight is : ${obj.weight}")
}