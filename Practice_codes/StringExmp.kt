fun main() {
    var a = 5
    var s1 = "Value of a is : $a" // String Interpolation

    println("$s1")

    a = 10

    println("${s1.replace("is" , "was")} , but now the value of a is : $a")
}