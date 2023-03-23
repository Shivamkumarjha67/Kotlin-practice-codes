// Return type declaretion

fun sum1(a : Int, b : Int) : Int {
    return a+b;
}

fun sum2(x : Int, y : Int) = x + y

// Funtion with no return type is declared with "Unit" or left undeclared.

// ------------------------------------------------

fun show(x : Int, y : Int) : Unit {
    println("This is function show")
    println("Sum of $x and $y is ${x+y}")
}

fun display(x : Int, y : Int) {
    println("This is display function")
    println("Sum of $x and $y is ${x+y}")
}

// ------------------------------------------------

fun main() {
    val a = 20
    val m = 45
    val n = 60
    println("sum of $a and $m is : ${sum1(a,m)}")
    println("sum of $n and $m is : ${sum2(n,m)}")

    show(a,n)
    display(m,n)

    println(returnAny())
}

// -------------------------------------------------------

// Function can return any data type using keyword "any" , as we use do in java by declaring as Object.

fun returnAny() : Any {

    // Any value can be returned.
    
    // return true
    // return 4.5
    // return 1
    // return "shivam"
    // return d
    return 8.9849746767
}

// Better to use specified type if we are aware of type of data to be returned.