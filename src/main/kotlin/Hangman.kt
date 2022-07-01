fun main() {
    val setOfWords = setOf("ELEPHANT", "HANDKERCHIEF", "WINDOW", "REFRIGERATOR", "SUNGLASSES")
    val randomWord = setOfWords.random()
    var chance = 6
    var typedWord = CharArray(randomWord.length)
    println(randomWord)

    do {
        printHanger(chance)
        printWord(typedWord)

        println("You have $chance guess(ess) left")
        println("Please enter a letter")
        val input = readLine() ?: ""
        val letter: Char = input[0].uppercaseChar()

        if (randomWord.contains(letter)) {
            for (i in randomWord.indices) {
                if (letter == randomWord[i]) {
                    typedWord[i] = letter
                }
            }
        } else {
            chance--
        }

//        if all letters are entered and the char array doesn't hold empty value then exit loop
        if (!typedWord.contains('\u0000')) {
            break
        }

    } while (chance > 0)

    val convertArrToString = String(typedWord)
    if (convertArrToString == randomWord) {
        println("Congratulations, you win")
    } else {
        printHangerFullBody()
        println("Sorry you lost. The word was")
        println(randomWord)
    }
}

fun printWord(typesWord: CharArray) {
    for (i in typesWord.indices) {
        if (typesWord[i].isLetter()) {
            print(typesWord[i] + " ")
        } else {
            print("__ ")
        }
    }
    println()
}

fun printHanger(numberOfChances: Int) {
    when (numberOfChances) {
        6 -> printEmptyHanger()
        5 -> printHangerWithHead()
        4 -> printHangerWithHeadAndBody()
        3 -> printHangerWithHeadAndBodyAndRightHand()
        2 -> printHangerWithHeadAndBodyAndBothHand()
        1 -> printHangerWithHeadAndBodyAndBothHandAndRightLeg()
        else -> printHangerFullBody()
    }
}

fun printEmptyHanger() {
    println(
        "  |------|-\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                " /|\\" + "\n" +
                "/ | \\" + "\n"
    )
}

fun printHangerWithHead() {
    println(
        "  |------|-\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t " + "O" + "\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                " /|\\" + "\n" +
                "/ | \\" + "\n"
    )
}

fun printHangerWithHeadAndBody() {
    println(
        "  |------|-\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t " + "O" + "\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\n" +
                " /|\\" + "\n" +
                "/ | \\" + "\n"
    )
}

fun printHangerWithHeadAndBodyAndRightHand() {
    println(
        "  |------|-\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t " + "O" + "\n" +
                "  |\t\t" + "/|" + "\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\n" +
                " /|\\" + "\n" +
                "/ | \\" + "\n"
    )
}

fun printHangerWithHeadAndBodyAndBothHand() {
    println(
        "  |------|-\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t " + "O" + "\n" +
                "  |\t\t" + "/|\\" + "\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\n" +
                " /|\\" + "\n" +
                "/ | \\" + "\n"
    )
}

fun printHangerWithHeadAndBodyAndBothHandAndRightLeg() {
    println(
        "  |------|-\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t " + "O" + "\n" +
                "  |\t\t" + "/|\\" + "\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t" + "/ " + "\n" +
                " /|\\" + "\n" +
                "/ | \\" + "\n"
    )
}

fun printHangerFullBody() {
    println(
        "  |------|-\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t " + "O" + "\n" +
                "  |\t\t" + "/|\\" + "\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t " + "|" + "\n" +
                "  |\t\t" + "/ \\" + "\n" +
                " /|\\" + "\n" +
                "/ | \\" + "\n"
    )
}