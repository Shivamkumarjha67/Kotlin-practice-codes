fun main() {
    println("Sum of 2 and 3 is : " + add(2,3))
    println("Sum of 2 and 3 is : " + add2(2,3))
    getName()
    stringExmp("student")
}

// Lambdas Expression can be used to simplify our codes.

val add : (Int,Int) -> Int = {x,y -> (x+y)}

val add2 = {a : Int, b : Int -> a + b}

val getName = {println("My name is Shivam Kumar Jha")}

val stringExmp : (String) -> Unit = {getOccupation -> println("I am a : " + getOccupation)}