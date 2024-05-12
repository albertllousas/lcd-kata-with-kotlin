package kata

object LCD {

    private val lcdNumbers = mapOf(
        1 to """  
                >  
                >  |
                >  |
                """.trimMargin(">"),
        2 to """  
                > _  
                > _|
                >|_
                """.trimMargin(">"),
        3 to """  
                > _  
                > _|
                > _|
                """.trimMargin(">"),
        4 to """  
                >  
                >|_|
                >  |
                """.trimMargin(">"),
        5 to """  
                > _  
                >|_ 
                > _|
                """.trimMargin(">"),
        6 to """  
                > _  
                >|_ 
                >|_|
                """.trimMargin(">"),
        7 to """  
                > _  
                >  |
                >  |
                """.trimMargin(">"),
        8 to """  
                > _  
                >|_|
                >|_|
                """.trimMargin(">"),
        9 to """  
                > _  
                >|_|
                >  |
                """.trimMargin(">"),
        0 to """  
                > _  
                >| |
                >|_|
                """.trimMargin(">")
    )

    fun convert(number: Int): String {
        return lcdNumbers[number] ?: TODO()
    }
}
