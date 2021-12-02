package Day1

import java.io.File
import java.io.InputStream


class Day1b(pathname:String ) : IDay1(pathname) {

     override fun run() {
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
        println("nr. larger: $counter")

    }
}