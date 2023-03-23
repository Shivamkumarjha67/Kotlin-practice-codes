fun main() {
    var nitin = Player("nitin")
    nitin.show()
    println(nitin.weapon1.name)
    println(nitin.weapon1.damagedone)

    var weapon2 = Weapons("AK47",79)
    nitin.weapon1 = weapon2 // reference is made.

    println(nitin.weapon1.name)
    println(nitin.weapon1.damagedone)

    weapon2.damagedone = 66

    println(nitin.weapon1.damagedone)
}

class Player(val name : String, var lives : Int = 2, var levels : Int = 3, var score : Int = 4) {
    var weapon1 = Weapons("k-28",24)
    fun show() {
        println("""
            name : $name
            lives : $lives
            level : $levels
            score : $score
        """)
    }
}

class Weapons(val name : String, var damagedone : Int = 0) {

}