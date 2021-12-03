package Day1


class Day1b(pathname: String) : Day1(pathname) {

    override fun run() {
        val windowSize = 3
        val window = IntArray(windowSize) { 0 }
        var windowSum = 0
        var pWindowSum = 0
        inputStream.bufferedReader().forEachLine {
            depth = it.toInt()

            // update window
            windowSum -= window[0]
            for (i: Int in 0..windowSize-2) {
                window[i] = window[i+1]
            }
            window[windowSize-1] = depth
            windowSum += window[windowSize-1]

            // update counter if window is full (skip the starting `windowSize`)
            // and > previous window
            if (window[0] > 0 && windowSum > pWindowSum) counter++

            pWindowSum = windowSum
        }
        println("nr. larger: $counter")

    }
}