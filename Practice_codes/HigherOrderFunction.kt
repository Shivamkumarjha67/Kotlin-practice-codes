fun main() {
    highOrderAdd(add)
    highOrderPrint(printMe)
    HigherClass(printMe)
}

val add = {a : Int, b : Int -> (a+b)}

fun highOrderAdd(addFun : (Int,Int) -> Int) {
    println("sum is : " + addFun(5,10))
}

val printMe = {println("This is printMe ! ")}

fun highOrderPrint(printFun : () -> Unit) {
    printFun()
}

class HigherClass(func : () -> Unit) {
    
}