class Example {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            //------- In pair we can add any data irrespective of type.---------

            val (a,b) = Pair("A",1)
            println("$a $b")

            //------- Also can be declared in this way. -----------

            val name = Pair(1,"Shivam")
            println("${name.first} ${name.second}")

            //------- Pair can be made nested -----------

            val exmp = Pair("Shivam",Pair("Kumar","Jha"))
            // explicitly called each pair
            println("${exmp.first} ${exmp.second.first} ${exmp.second.second}")
            // called only otter pair
            println("${exmp.first} ${exmp.second}")
            println("$exmp")
        }
    }
}