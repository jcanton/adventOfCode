package Day2

class Day2a(pathName: String) : Day2(pathName) {

    override fun move(direction: String, value: Int) {
        when (direction) {
            "forward" -> horizontal += value
            "down" -> depth += value
            "up" -> depth -= value
        }
    }
}