import Day3.Day3
import Day3.Day3a
import Day3.Day3b

fun main() {
    val pathname = "src/main/resources/inputFiles/day3_input"
    var day: Day3
    day = Day3a(pathname)
    day.run()
    day = Day3b(pathname)
    day.run()
}