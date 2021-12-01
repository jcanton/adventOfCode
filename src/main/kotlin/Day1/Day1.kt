package Day1

import java.io.File
import java.io.InputStream

class Day1 {

    fun run() {

        val inputStream: InputStream = File("inputFiles/day1_input").inputStream()

        var counter: Int = -1
        var pDepth: Int = 0
        var depth: Int

        inputStream.bufferedReader().forEachLine {
            depth = it.toInt()
            if (depth > pDepth) {
                counter += 1
            }

            pDepth = depth
        }
        println("nr. larger: ${counter}")
    }

}
