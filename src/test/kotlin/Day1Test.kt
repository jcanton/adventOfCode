import Day1.Day1a
import Day1.Day1b
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class Day1Test {
    val pathname = "src/main/resources/inputFiles/day1_input"

    @Test
    fun givenFileProducesRightCount() {
        assertEquals(1559, Day1a(pathname).countInc())
        assertEquals(1600, Day1b(pathname).countInc())
    }
}