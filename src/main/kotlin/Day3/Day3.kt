package Day3

import java.io.File

abstract class Day3(pathname: String) {
    var diagRepo: List<String>

    init {
        diagRepo = File(pathname).inputStream().bufferedReader().readLines()
    }

    abstract fun run(): Int

}