fun main() {
    val obj = This_Example()

    obj.setNo(20)
    obj.setNum(40)
    println("Value of class a :" + obj.a)

    val obj1 = ExtendingClass()
}

open class This_Example {
    val a = 100

    fun setNo(a : Int) {
        println("Value of a : " + a)
    }

    // Using this keyword we get the attributes of class rather than any specific block.

    fun setNum(a : Int) {
        println("Value of a : " + this.a)
    }
}

class ExtendingClass : This_Example() {
    init {
        println(super.a)
        super.setNo(4999)
    }
}