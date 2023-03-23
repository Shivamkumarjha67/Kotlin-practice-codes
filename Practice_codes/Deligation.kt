// Use remove the redundant code by using deligation keyword "by".

fun main() {

    val taskName : String = "Adding"
    val bgTaskObj = BgTask(taskName)
    val bgExecuteTaskObj = BgExecuteTask(taskName)

    bgTaskObj.create()
    bgExecuteTaskObj.execute()

    val taskManagerObj = TaskManager(bgTaskObj,bgExecuteTaskObj)
    taskManagerObj.create()
    taskManagerObj.execute()
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

class TaskManager(val creator : Task, val executor : ExecuteTask) : Task by creator, ExecuteTask by executor {

    // Instead of writing overriding statement we directly perform deligation.

    // override fun create() {
    //     creator.create()
    // }

    // override fun execute() {
    //     executor.execute()
    // }
}