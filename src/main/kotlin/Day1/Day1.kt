package Day1

import java.io.File
import java.io.InputStream

class Day1(private val sP: Char) {

    fun run() {

        val pathname = "src/main/resources/inputFiles/day1_input"
        val inputStream: InputStream = File(pathname).inputStream()

        if (sP == 'a') {
            var counter = -1
            var pDepth = 0
            var depth: Int

            inputStream.bufferedReader().forEachLine {
                depth = it.toInt()
                if (depth > pDepth) {
                    counter++
                }

                pDepth = depth
            }
            println("nr. larger: $counter")
        } else {
            println("nr. larger: 2")
        }
    }
}
