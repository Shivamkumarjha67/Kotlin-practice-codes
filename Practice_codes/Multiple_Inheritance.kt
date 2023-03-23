fun main() {
    val obj = ClassA()

    obj.giveSum()
    
    println("Multiply of two elements are : " + obj.multiplyTwo(2,5))
    println("Multiply of three elements are : " + obj.multiplyThree(2,5,3))
}

interface interfaceFirst {
    val a : Int
    
    fun multiplyTwo(x : Int, y : Int) : Int
}

interface interfaceSecond {
    val b : Int

    fun multiplyThree(x : Int, y : Int, z : Int) : Int
}

class ClassA : interfaceFirst,interfaceSecond{
    override val a = 20
    override val b = 30

    val sum = a + b

    fun giveSum() {
        println("Sum of a and b : " + sum)
    }

    override fun multiplyTwo(x : Int, y : Int) : Int {
        return x*y
    }

    override fun multiplyThree(x : Int, y : Int, z : Int) : Int {
        return (x*y*z)
    }
}