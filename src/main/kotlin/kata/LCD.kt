package kata

object LCD {

    private val one = """  
                        >  
                        >  |
                        >  |
                        """.trimMargin(">")
    private val two = """  
                        > _  
                        > _|
                        >|_
                        """.trimMargin(">")

    fun convert(number: Int): String {
        return when (number) {
            1 -> one
            2 -> two
            else -> TODO()
        }
    }
}
