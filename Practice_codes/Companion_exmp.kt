fun main() {
    val obj = CompanionClass()
    println(CompanionClass.secondValue) // Using Class name only we used the attributes lies in companion object.
    println(obj.firstValue) // We needed object to call non-static attributes.
    println(obj.add(5,4))
    println(CompanionClass.sum(6,6))
}

class CompanionClass {
    val firstValue = 10
    fun add(a : Int, b : Int) = a+b

    // companion object is created to declare all the attributes which is static
    // , as we don't have the concept of static in Kotlin.
    // Using Class name only we Can directly call all the attributes that companion object has.
    // No need to create object explicitly.

    companion object {
        val secondValue = 20
        fun sum(a : Int, b : Int) = a+b
    }
}