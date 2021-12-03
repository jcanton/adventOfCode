import Day2.Day2a
import Day2.Day2b
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day2Test {
    val pathname = "src/main/resources/inputFiles/day2_input"

    @Test
    fun givenFileProducesRightCount() {
        assertEquals(1936494, Day2a(pathname).run())
        assertEquals(1997106066, Day2b(pathname).run())
    }
}