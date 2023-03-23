fun main() {
    val classA = ClassA()
    val classB = ClassB()

    println("Value of a in both the class are : " + classA.a + " and " + classB.a)
    println("Value of sum in both the class are : " + classA.add(2,3) + " and " + classB.add(2,3))
    println("Value of sum in both the class are : " + classA.add(2,3,4) + " and " + classB.add(2,3,4))
}

interface Add {
    val a : Int
    fun add(a : Int, b : Int) : Int
    fun add(a : Int, b : Int, c : Int) : Int
}

class ClassA : Add {
    override val a = 25

    override fun add(a : Int, b : Int) : Int {
        return (a + b)
    }

    override fun add(a : Int, b : Int, c : Int ) : Int {
        return (a + b + c)
    }
}

class ClassB : Add {
    override val a = 50

    override fun add(a : Int, b : Int) : Int {
        return 2*(a + b)
    }

    override fun add(a : Int, b : Int, c : Int ) : Int {
        return 2*(a + b + c)
    }
}