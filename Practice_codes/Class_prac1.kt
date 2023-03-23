fun main() {
    val tim = Player("tim")
    // println(tim.name)
    // println(tim.lives)
    // println(tim.level)
    // println(tim.score)

    // tim.show()
    tim.show1()

    val louise = Player("louise")
    louise.lives = 6
    louise.level = 7
    louise.score = 8

    louise.show1()
}

class Player(val name : String) {
    var lives = 1;
    var level = 2;
    var score = 3;

    fun show() {
        println(name)
        println(lives)
        println(level)
        println(score)
    }

    fun show1() {
        println("""
        name : $name
        lives : $lives
        level : $level
        score : $score
        """)
    }
}