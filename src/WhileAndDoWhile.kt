fun main() {
    val timesTable = 11
    var index = 1
    while (index <= 10) {
        println("$timesTable x $index = ${timesTable * index}")
        index++;
    }


    var userInput: Int
    index = 1
    do {
        print("Times table: ")
        userInput = readlnOrNull()?.toIntOrNull() ?: 0

        if (userInput <= 0) {
            println("Please enter a valid positive number.")
        } else {

            do {
                println("$userInput x $index = ${userInput * index}")
                index++
            } while (index <= 10)
        }

    } while (userInput <= 0)

    println("You entered a valid positive number: $userInput")
}