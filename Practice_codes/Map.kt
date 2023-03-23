fun main() {
    var aMap = mapOf(1 to "Shiv", 4 to "Kumar", true to false)
    println(aMap)

    var bMap = mutableMapOf<String,String>("Chaya" to "Anaya")
    var cMap = mapOf("Riya" to "Siya", "Raman" to "Aman")
    bMap.putAll(cMap)
    // bMap[0] = ("Rajan" to "Sajan")
    println(bMap)
}