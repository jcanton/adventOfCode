package Day1

import java.io.File
import java.io.InputStream


class Day1a(pathname:String ) : IDay1(pathname) {

     override fun run() {




            var pDepth = 0
            inputStream.bufferedReader().forEachLine {
                depth = it.toInt()
                if (depth > pDepth) counter++

                pDepth = depth
            }



        println("nr. larger: $counter")

    }
}