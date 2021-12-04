import Day3.Day3
import Day3.Day3a
import Day3.Day3b
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day3Test {
    val pathname = "src/main/resources/inputFiles/day3_input"

    @Test
    fun givenFileProducesRightCount() {
        assertEquals(845186, Day3a(pathname).run())
        assertEquals(4636702, Day3b(pathname).run())
    }
}