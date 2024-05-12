package kata

object LCD {

    private val numberLcdMap = mapOf(
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
        val numberAsLCD: List<String> = number.toString().map { digit -> numberLcdMap[digit.digitToInt()]!! }
        val firstLineOfEachNumber = numberAsLCD.map { it.substringBefore("\n") }.joinToString("")
        val secondLineOfEachNumber = numberAsLCD.map { it.substringAfter("\n").substringBefore("\n") }.joinToString("")
        val thirdLineOfEachNumber = numberAsLCD.map { it.substringAfterLast("\n") }.joinToString("")
        return "$firstLineOfEachNumber\n$secondLineOfEachNumber\n$thirdLineOfEachNumber"
    }
}




