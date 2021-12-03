package Day2

import java.io.File

abstract class Day2(pathname: String) {
    var commandList: List<String>
    var horizontal: Int = 0
    var depth: Int = 0
    var aim: Int = 0

    init {
        commandList = File(pathname).inputStream().bufferedReader().readLines()
    }

    private fun dive(commandList: List<String>) {
        var direction: String
        var value: Int
        for (command in commandList) {
            direction = command.split(" ")[0]
            value = command.split(" ")[1].toInt()
            move(direction, value)
        }
    }

    abstract fun move(direction: String, value: Int)

    fun run(): Int {
        dive(commandList)
        println("Final position: [$horizontal, $depth] = ${horizontal * depth}")
        return horizontal * depth
    }
}