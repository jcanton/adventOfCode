import Day1.Day1a
import Day1.Day1b
import Day1.IDay1

fun main() {
    val pathname = "src/main/resources/inputFiles/day1_input"
    var day1: IDay1
    day1 = Day1a(pathname)
    day1.run()
    day1 = Day1b(pathname)
    day1.run()
}