fun main() {
    // Question mark is used to tell compiler for now variable is storing null but at run time it will have some value.
    var name : String? = null
    // Double Exclamation mark give surity to the compiler at run time there will no null value in variable
    // otherwise programs gives null pointer exceptions.

    // println("Name is : ${name!!.length}") // --> throws java.lang.NullPointerException

    name = "Shivam" // In this case compiler will ask assigning null to name is redundant.
    println("Name is : ${name!!.length}") // In this line compiler is asking name has been initialized so no need to '
    // mention (!!.) as precausionary measure.
}