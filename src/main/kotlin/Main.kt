import Day2.Day2
import Day2.Day2a
import Day2.Day2b

fun main() {
    val pathname = "src/main/resources/inputFiles/day2_input"
    var day: Day2
    day = Day2a(pathname)
    day.run()
    day = Day2b(pathname)
    day.run()
}