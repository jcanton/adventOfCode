import Day1.Day1a
import Day1.Day1b
import Day1.IDay1

fun main() {
    val pathname = "src/main/resources/inputFiles/day1_input"
    val day1: IDay1
    Day1a(pathname).run()
    Day1b(pathname).run()
}