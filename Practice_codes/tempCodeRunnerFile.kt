fun main() {
    val taskName : String = "Adding"
    val bgTaskObj = BgTask(taskName)
    val bgExecuteTaskObj = BgExecuteTask(taskName)

    bgTaskObj.create()
    bgExecuteTaskObj.execute()
}

interface Task {
    fun create()
}

interface ExecuteTask {
    fun execute()
}

class BgTask(val taskName : String) : Task {
    override fun create() {
        println("Task : " + taskName + " is created ! ")
    }
}

class BgExecuteTask(val taskName : String) : ExecuteTask {
    override fun execute() {
        println("Task : " + taskName + " is executing ! ")
    }
}