fun main() {

    val tasks = mutableListOf<String>()

    while (true) {

        println("1- Add Task\n2- Delete Task\n3- Show Tasks\n4- Exit")

        print("Choose option: ")
        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> addTask(tasks)
            2 -> deleteTask(tasks)
            3 -> showTasks(tasks)
            4 -> break
            else -> println("Invalid option")
        }
    }
}

fun addTask(tasks: MutableList<String>) {
    print("Enter task: ")
    val task = readLine() ?: ""
    tasks.add(task)
    println("Task added")
}

fun deleteTask(tasks: MutableList<String>) {

    if (tasks.isEmpty()) {
        println("No tasks to delete")
        return
    }

    for (i in tasks.indices) {
        println("${i + 1}. ${tasks[i]}")
    }

    print("Enter task number to delete: ")
    val num = readLine()?.toIntOrNull()

    if (num != null && num in 1..tasks.size) {
        tasks.removeAt(num - 1)
        println("Task deleted")
    } else {
        println("Invalid number")
    }
}

fun showTasks(tasks: List<String>) {

    if (tasks.isEmpty()) {
        println("No tasks available")
    } else {
        println("Your Tasks:")
        for (i in tasks.indices) {
            println("${i + 1}. ${tasks[i]}")
        }
    }
}