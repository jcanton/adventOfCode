package Day1

import java.io.File
import java.io.InputStream

abstract class IDay1(pathname: String) {

    lateinit var inputStream: InputStream

    var counter: Int = -1
    var depth: Int = 0

    init {
        inputStream = File(pathname).inputStream()
    }

    abstract fun run()
}
