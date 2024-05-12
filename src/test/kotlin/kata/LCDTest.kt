package kata

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class LCDTest {

    @TestFactory
    fun `converting numbers in to LCD styled number`() =
        listOf(
            Pair(
                1, """  
                        >  
                        >  |
                        >  |
                        """.trimMargin(">")
            ),
            Pair(
                2, """  
                        > _  
                        > _|
                        >|_
                        """.trimMargin(">")
            )
        ).map { (number, expected) ->
            dynamicTest("should convert $number") {
                LCD.convert(number) shouldBe expected
            }
        }
}
