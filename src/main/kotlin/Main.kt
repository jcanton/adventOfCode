import Day1.Day1
import Day1.Day1a
import Day1.Day1b

fun main() {
    val pathname = "src/main/resources/inputFiles/day1_input"
    var day1: Day1
    day1 = Day1a(pathname)
    day1.countInc()
    day1 = Day1b(pathname)
    day1.countInc()
}