class Example {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Declared as a single value each.
            val (x,y,z) = Triple(1,'s',"Shivam")
            println("$x $y $z")

            val name = Triple("Shivam","Kumar","Jha")
            println("${name.first} ${name.second} ${name.third}")

            val exmp = Triple(1,2,Triple(3,4,5))
            println("${exmp.first} ${exmp.second} ${exmp.third.first} ${exmp.third.second} ${exmp.third.third}")
            // both way of printing gives same result.
            println(exmp)
            println("$exmp")
        }
    }
}