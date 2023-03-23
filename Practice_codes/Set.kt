fun main() {

    // Set contains only uniqe values.
    // setOf() -> are unmutable.
    // Unordered
    var aSet = setOf(1,8,3,"Raj",1)
    println(aSet)
    println(aSet.size)

    var bSet = mutableSetOf("Raj",'f','u','c','k',0,1,0,1)
    bSet.add(true)
    bSet.remove(1)
    println(bSet)
}