package kata

object LCD {

    private val lcdNumbers = mapOf(
        1 to "   \n  |\n  |",
        2 to " _ \n _|\n|_ ",
        3 to " _ \n _|\n _|",
        4 to "   \n|_|\n  |",
        5 to " _ \n|_ \n _|",
        6 to " _ \n|_ \n|_|",
        7 to " _ \n  |\n  |",
        8 to " _ \n|_|\n|_|",
        9 to " _ \n|_|\n  |",
        0 to " _ \n| |\n|_|"
    )

    fun convert(number: Int): String {
        val chars = number.toString().toCharArray()
        val numbers = chars.map { lcdNumbers[it.digitToInt()]!! }
        val firstLine = numbers.map { it: String -> "${it[0]}${it[1]}${it[2]}" }.joinToString("")
        val secondLine = numbers.map { it: String -> "${it[4]}${it[5]}${it[6]}" }.joinToString("")
        val thirdLine = numbers.map { it: String -> "${it[8]}${it[9]}${it[10]}" }.joinToString("")
        return "$firstLine\n$secondLine\n$thirdLine"
    }
}




