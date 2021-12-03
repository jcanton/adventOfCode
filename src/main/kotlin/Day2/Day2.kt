package Day2

import java.io.File

class Day2(pathName: String) {
    var horizontal: Int = 0
    var depth: Int = 0

    val commandList = File(pathName).inputStream().bufferedReader().readLines()

    private fun dive(commandList: List<String>) {
        var direction: String
        var value: Int
        for (command in commandList) {
            direction = command.split(" ")[0]
            value = command.split(" ")[1].toInt()
            move(direction, value)
        }
    }

    private fun move(direction: String, value: Int) {
        when(direction) {
            "forward" -> horizontal += value
            "down" -> depth += value
            "up" -> depth -= value
        }
    }

    fun run(): Int {
        dive(commandList)
        println("Final position: [$horizontal, $depth] = ${horizontal * depth}")
        return horizontal * depth
    }
}