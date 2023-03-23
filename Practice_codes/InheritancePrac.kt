// Super Class must be "open" otherwise it will be considered as final.

open class Enemy(val name : String, var hitPoints : Int, var lives : Int) {

    open fun takeDamage(damage : Int) {
        val remainingPoints = hitPoints - damage
        if(remainingPoints > 0) {
            hitPoints = remainingPoints
            println("$name took $damage point of damage, and left with $hitPoints hitPoints")
        } else {
            lives -= 1
            println("$name lost a life")
        }
    }

    override fun toString() : String {
        return "name : $name, hitpoints : $hitPoints, lives : $lives"
    }
}

// Inheriting Class should have same constructor as super class.

// class Troll(name : String, hitPoints : Int, lives : Int) : Enemy(name,hitPoints,lives) {
//     fun show() {
//         println("this is show method")
//     }
// }

// Rather we can provide with some specific value in place of same inheriting constructor.

class Troll(name : String) : Enemy(name , 35, 6) {
    override fun takeDamage(damage : Int) {
        super.takeDamage(damage/2)
    }
}

fun main() {
    val raja = Enemy("Raja",45,4)
    println(raja)

    raja.takeDamage(45)
    println(raja)

    // val t = Troll("Gaza", 67, 9)
    // t.show()
    // t.takeDamage(34)
    // println(t)

    val test = Troll("test")
    println(test)
    // test.takeDamage()
    test.takeDamage(34)
}