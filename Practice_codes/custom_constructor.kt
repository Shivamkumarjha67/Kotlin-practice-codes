// Two type of constructor are there i.e Primary constructor and Secondary constructor.

// Custom constructor is created when more than one constructor is needed.

class KotlinBasic {
    constructor(a : Int,b : Int) {
        val sum = a+b
        println("Sum of two is : " + sum)
    }

    constructor(a : Int, b : Int, c : Int) {
        val sum = a+b+c
        println("Sum of three is : " + sum)
    }
} 

fun main() {
    KotlinBasic(5,6);
    KotlinBasic(8,9,7)
}