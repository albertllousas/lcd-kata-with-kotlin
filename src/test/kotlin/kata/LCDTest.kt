package kata

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class LCDTest {

    @Test
    fun `should convert 1 in to LCD styled number`() {
        val result = LCD.convert(number = 1)

        result shouldBe """  
                        >  
                        >  |
                        >  |
                        """.trimMargin(">")
    }
}
