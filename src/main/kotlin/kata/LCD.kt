package kata

import kata.LCD.lcdNumbers

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
        return if (chars.size == 1)
            lcdNumbers[number]!!
        else if (chars.size == 2) {
            // first number = chars fst pos from map
            // second number = chars snd pos from map
            // first line -> fst 3 digits first number + fst 3 digits second number
            // second line -> fst 3 digits first number after first \n + fst 3 digits second number after first \n
            // third line -> fst 3 digits first number after second \n + fst 3 digits second number after second \n
            // join three lines string with new line chars
            ""
        } else TODO()
    }
}
