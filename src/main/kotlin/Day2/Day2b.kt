package Day2

class Day2b(pathName: String) : Day2(pathName) {

    override fun move(direction: String, value: Int) {
        when (direction) {
            "forward" -> {
                horizontal += value
                depth += aim * value
            }
            "down" -> aim += value
            "up" -> aim -= value
        }
    }

}
