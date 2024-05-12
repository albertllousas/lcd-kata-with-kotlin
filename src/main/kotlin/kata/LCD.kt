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
            val fstNumber = lcdNumbers[chars[0].digitToInt()]!!
            val sndNumber = lcdNumbers[chars[1].digitToInt()]!!
            val firstLine = "${fstNumber[0]}${fstNumber[1]}${fstNumber[2]}${sndNumber[0]}${sndNumber[1]}${sndNumber[2]}"
            val secondLine = "${fstNumber[4]}${fstNumber[5]}${fstNumber[6]}${sndNumber[4]}${sndNumber[5]}${sndNumber[6]}"
            val thirdLine = "${fstNumber[8]}${fstNumber[9]}${fstNumber[10]}${sndNumber[8]}${sndNumber[9]}${sndNumber[10]}"
            val result = "$firstLine\n$secondLine\n$thirdLine"
            result
        } else if (chars.size == 3) {
            val fstNumber = lcdNumbers[chars[0].digitToInt()]!!
            val sndNumber = lcdNumbers[chars[1].digitToInt()]!!
            val trdNumber = lcdNumbers[chars[2].digitToInt()]!!
            val firstLine = "${fstNumber[0]}${fstNumber[1]}${fstNumber[2]}${sndNumber[0]}${sndNumber[1]}${sndNumber[2]}${trdNumber[0]}${trdNumber[1]}${trdNumber[2]}"
            val secondLine = "${fstNumber[4]}${fstNumber[5]}${fstNumber[6]}${sndNumber[4]}${sndNumber[5]}${sndNumber[6]}${trdNumber[4]}${trdNumber[5]}${trdNumber[6]}"
            val thirdLine = "${fstNumber[8]}${fstNumber[9]}${fstNumber[10]}${sndNumber[8]}${sndNumber[9]}${sndNumber[10]}${trdNumber[8]}${trdNumber[9]}${trdNumber[10]}"
            val result = "$firstLine\n$secondLine\n$thirdLine"
            result
        } else {
            val numbers = chars.map { lcdNumbers[it.digitToInt()]!! }
            val firstLine = numbers.map { it: String -> "${it[0]}${it[1]}${it[2]}" }.joinToString("")
            val secondLine = numbers.map { it: String -> "${it[4]}${it[5]}${it[6]}" }.joinToString("")
            val thirdLine = numbers.map { it: String -> "${it[8]}${it[9]}${it[10]}" }.joinToString("")
            "$firstLine\n$secondLine\n$thirdLine"
        }
    }
}




