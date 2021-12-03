package Day1


class Day1a(pathname: String) : Day1(pathname) {

    override fun countInc(): Int {
        var pDepth = 0
        inputStream.bufferedReader().forEachLine {
            depth = it.toInt()
            if (depth > pDepth) counter++

            pDepth = depth
        }
        println("nr. larger: $counter")
        return counter
    }
}