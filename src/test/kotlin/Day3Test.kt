import Day3.Day3
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day3Test {
    val pathname = "src/main/resources/inputFiles/day3_input"

    @Test
    fun givenFileProducesRightCount() {
        assertEquals(845186, Day3(pathname).run())
    }
}