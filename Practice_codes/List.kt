fun main() {

    // listOf() -> Can accept any type of data in the list.
    // We can also declare as listOf<Any>().
    // But this list is not muttable. So operation like adding, removing can not be performed. i.e, aList.add() or aList.remove().
    // Repetation of object is possible.

    var aList = listOf("Shivam","Kumar","Jha",83,83) // this is unmuttable list
    println(aList)

    // mutableListOf() -> Type dependent decided at compile time only. Or specifically we can also mention type.
    var bList = mutableListOf("Shivam","Kumar")
    println(bList)
    // bList.add(98) -> Action can not be performed, as expected type was String.

    var cList = mutableListOf("Shivam",98.3,true) // Here at compile time - type of cList is decided.
    // or we can declare as --> var cList = mutableListOf<Any>("Shivam",98.3,true)
    cList.add('c')
    println(cList)

    var dList = listOf("Naugachia",83)
    cList.addAll(dList) // List can also be added to another list using addAll() method.
    cList.add(0,"Samir") // Index based changes can also be made.

    println(cList)
}