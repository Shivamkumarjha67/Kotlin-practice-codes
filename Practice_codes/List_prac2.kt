fun main() {
    val raja = Player("raja")

    val redPotion = Loot("Red Potion", LootType.POTION, 44.5)
    raja.getLoot(redPotion)

    raja.show()

    raja.getLoot(Loot("3+ chest Armor", LootType.ARMOUR, 89.00))

    raja.getLoot(Loot("5+ chest Armour", LootType.ARMOUR, 96.9))

    raja.show()
    raja.showInventory()

    raja.getLoot(Loot("Ring of Protection +2 ", LootType.RING, 45.9))

    raja.showInventory()

    // if(raja.removeLoot(redPotion)) {
    //     raja.showInventory()
    // } else {
    //     println("You don't have ${redPotion.name}")
    // }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 33.33)

    if(raja.removeLoot(bluePotion)) {
        raja.showInventory()
    } else {
        println("You don't have ${bluePotion.name} Loot")
    }

    if(raja.removeLoot("Red Potion")) {
        raja.showInventory()
    } else {
        println("Red Potion Loot is not present")
    }
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

// Encapsulating inventory List in Player class. (By making it private)

class Player(val name : String, var lives : Int = 2, var levels : Int = 3, var score : Int = 4) {

    private val inventory = ArrayList<Loot>()
    
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

    // Encapsulating functions i.e, getLoot and removeLoot

    fun getLoot(item : Loot) {
        inventory.add(item)
    }

    fun removeLoot(item : Loot) : Boolean {
        return (if(inventory.contains(item)) {
            inventory.remove(item)
            true
        }
        else
        false
        )
    }

    // Overloading removeLoot() function ---> removing based on name of loot.

    fun removeLoot(itemName : String) : Boolean {
        for(item in inventory) {
            if(itemName.equals("${item.name}")) {
                println("${item.name} is getting removed")
                inventory.remove(item)
                return true;
            }
        }
        return false

        //  ----------------------- Another Way ------------------------ (problem)

        // println("$itemName is getting removed")
        // return inventory.removeIf (it.name == itemName)
    }
}