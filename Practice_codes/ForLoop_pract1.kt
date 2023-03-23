fun main() {
    // type1()
    chalange1()
}

fun type1() {
    // for(i in 1..10) {
    //     println("$i squared is : ${i*i}")
    // }

    // until doesn't include the last value.

    for(i in 0 until 10) {
        println("$i squared is : ${i*i}")
    }

    println("=======================================")

    // Printing in reverse order using "downTo"

    for(i in 10 downTo 1) {
        println("$i")
    }

    println("=======================================")

    // Use of step

    for(i in 20 downTo 1 step 2) {
        println("$i")
    }
}

fun chalange1() {
    // for(i in 1..100) {
    //     if(i % 5 == 0 && i % 3 == 0)
    //     println("$i")
    // }

    // Efficent way
    for(i in 3..100 step 3) {
        if(i % 5 == 0)
        println(i)
    }
}