fun main() {
    val shiv = Player("shiv",8,4)
    shiv.show()

    val golu = Player("Golu",5,2,1000)
    golu.show()
}

class Player(val name : String, var lives : Int = 2, var levels : Int = 3, var score : Int = 4) {
    fun show() {
        println("""
            name : $name
            lives : $lives
            level : $levels
            score : $score
        """)
    }
}