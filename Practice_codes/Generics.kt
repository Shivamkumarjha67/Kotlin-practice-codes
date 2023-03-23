fun main() {
    GenricClass<Int> (30)
}

class GenricClass<T> (value : T) {
    init {
        println("Value is : " + value)
        check<String>("Great")
    }
}

fun <T> check(text : T) {
    println("Value of text is : " + text)
}