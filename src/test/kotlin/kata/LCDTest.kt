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
            ,
            Pair(
                3, """  
                        > _ 
                        > _|
                        > _|
                        """.trimMargin(">")
            ),
            Pair(
                4, """  
                        >   
                        >|_|
                        >  |
                        """.trimMargin(">")
            ),
            Pair(
                5, """  
                        > _ 
                        >|_ 
                        > _|
                        """.trimMargin(">")
            ),
            Pair(
                6, """  
                        > _ 
                        >|_ 
                        >|_|
                        """.trimMargin(">")
            ),
            Pair(
                7, """  
                        > _ 
                        >  |
                        >  |
                        """.trimMargin(">")
            ),
            Pair(
                8, """  
                        > _ 
                        >|_|
                        >|_|
                        """.trimMargin(">")
            ),
            Pair(
                9, """  
                        > _ 
                        >|_|
                        >  |
                        """.trimMargin(">")
            ),
            Pair(
                0, """  
                        > _ 
                        >| |
                        >|_|
                        """.trimMargin(">")
            ),
            Pair(
                12, """  
                        >    _ 
                        >  | _|
                        >  ||_ 
                        """.trimMargin(">")
            ),
            Pair(
                123, """  
                        >    _  _ 
                        >  | _| _|
                        >  ||_  _|
                        """.trimMargin(">")
            ),
            Pair(
                1234, """  
                        >    _  _    
                        >  | _| _||_|
                        >  ||_  _|  |
                        """.trimMargin(">")
            )
        ).map { (number, expected) ->
            dynamicTest("should convert $number") {
                LCD.convert(number) shouldBe expected
            }
        }
}
