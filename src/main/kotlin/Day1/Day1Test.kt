package Day1

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals


internal class Day1Test {
    val pathname = "src/main/resources/inputFiles/day1_input"

    @Test
    fun givenFileProducesRightCount() {
        assertEquals(1559, Day1a(pathname).countInc())
        assertEquals(1600, Day1b(pathname).countInc())
    }
}