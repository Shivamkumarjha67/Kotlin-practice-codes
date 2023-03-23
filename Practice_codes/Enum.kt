fun main() {
    println("Today is : " + Days.SATURDAY)

    for(day in Days.values()) {
        if(day.holidays) {
            println("" + day + " is Holiday")
        }
    }
}

enum class Days(val holidays : Boolean = false) {
    MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY(true)
}

enum class Gender {
    MALE,FEMALE,OTHERS
}

enum class Directions {
    NORTH,SOUTH,EAST,WEST
}