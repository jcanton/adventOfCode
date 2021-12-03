package Day1

import java.io.File
import java.io.InputStream

abstract class Day1(pathname: String) {

    var inputStream: InputStream

    var counter: Int = -1
    var depth: Int = 0

    init {
        inputStream = File(pathname).inputStream()
    }

    abstract fun run(): Int
}
