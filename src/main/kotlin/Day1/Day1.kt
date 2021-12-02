package Day1

import java.io.File
import java.io.InputStream


class Day1(private val sP: Char) : IDay1 {

    override fun run() {

        val pathname = "src/main/resources/inputFiles/day1_input"
        val inputStream: InputStream = File(pathname).inputStream()

        var counter: Int = -1
        var depth: Int

        if (sP == 'a') {

            var pDepth = 0
            inputStream.bufferedReader().forEachLine {
                depth = it.toInt()
                if (depth > pDepth) counter++

                pDepth = depth
            }

        } else {

            val windowSize = 3
            val window = IntArray(windowSize) { 0 }
            var windowSum = 0
            var pWindowSum = 0
            inputStream.bufferedReader().forEachLine {
                depth = it.toInt()

                // update window
                windowSum -= window[0]
                window[0] = window[1]
                window[1] = window[2]
                window[2] = depth
                windowSum += window[2]

                // update counter if window is full (skip the starting `windowSize`)
                // and > previous window
                if (window[0] > 0 && windowSum > pWindowSum) counter++

                pWindowSum = windowSum
            }

        }

        println("nr. larger: $counter")

    }
}