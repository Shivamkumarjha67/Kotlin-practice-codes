fun main() {
    val raja = Player("raja")
    println(raja)
    println(raja.toString())

    val redPotion = Loot("Red Potion", LootType.POTION, 44.5)
    raja.inventory.add(redPotion)

    raja.show()

    val chestArmor = Loot("3+ chest Armor", LootType.ARMOUR, 89.00)
    raja.inventory.add(chestArmor)

    val chestArmor2 = Loot("5+ chest Armour", LootType.ARMOUR, 96.9)
    raja.inventory.add(chestArmor2)

    raja.show()
    raja.showInventory()

    raja.inventory.add(Loot("Ring of Protection +2 ", LootType.RING, 45.9))

    raja.showInventory()
}

enum class LootType {
    POTION,RING,ARMOUR;
}

class Loot(val name : String, val type : LootType, val value : Double) {
    override fun toString() : String {
        return """
            name : $name
            type : $type
            value : $value
        """
    }
}

class Player(val name : String, var lives : Int = 2, var levels : Int = 3, var score : Int = 4) {
    val inventory = ArrayList<Loot>()
    // fun show() {
    //     println("""
    //         name : $name
    //         lives : $lives
    //         level : $levels
    //         score : $score
    //         ${inventory.get(0).name}
    //         ${inventory.get(0).type}
    //         ${inventory.get(0).value}
    //     """)
    // }

    fun show() {
        println("""
            name : $name
            lives : $lives
            level : $levels
            score : $score
        """)
    }

    fun showInventory() {
        println("$name 's inventory : ")

        // Using for-each Loop

        for(item in inventory) { 
            println(item)
        }
    }

    // when we call the class name only. Some Hashcode is returned by bydefault toString() function (i.e Player@1b6d3586)
    // so inorder to avoid that we overridden the toString() method.

    override fun toString() : String {
        return """
            name : $name
            lives : $lives
            level : $levels
            score : $score
        """
    }
}