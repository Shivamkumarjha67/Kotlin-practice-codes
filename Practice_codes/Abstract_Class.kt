fun main() {
    val obj = Exmp()

    println(obj.name + " " + obj.surName)
    println(obj.Add(4,4))

    val obj2 = Exmp2()
    println(obj2.name)
    println(obj2.Square(5))
}

abstract class AbClass {
    var name = "Shivam"

    abstract val surName : String

    abstract fun Add(a : Int, b : Int) : Int
}

// Every abstract functionality needs to overriden in the extending class.

class Exmp : AbClass() {

    // override var name = "Raja" // (Wrong) --> Cannot be overriden as it is final not abstract. If we would have made it abstract then it could not been initialized.

    override val surName = "Kumar"

    override fun Add(a : Int, b : Int) = a+b
}

interface iClass {
    val name : String 

    // Default declaration can be made in interface, and later can be overriden in the implementing class.
    
    fun Square(a : Int) : Int {
        return a*a
    }
}

class Exmp2 : iClass {
    override val name = "Pankaj"

    // We can also override already declared function of interface in implementing class.
    
    override fun Square(a : Int) = a*a*a
}