fun main() {
    val obj = ClassB()

    println(obj.name)
    obj.showMsg()

    println(ClassA().showMsg())
}

// Every class is by default final, so inorder to inherit we need to make them open using keyword "open".
// Attributes of the classes are also by default final, so inorder to override we nned to make them as open as well. 

open class ClassA {

    var name = "Shubham"

    open fun showMsg() {
        println("This is a parent Class")
    }
}

class ClassB : ClassA() {
    override fun showMsg() {
        println("This is a Child or sub Class")
    }
}