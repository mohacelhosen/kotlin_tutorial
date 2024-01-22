import java.util.Scanner
fun main() {
    print("Enter your favorite animal:: ")
    val userInput = Scanner(System.`in`)
    val animal = userInput.next().lowercase()

    when (animal) {
        "dog" -> println("animal is 🐕 $animal")
        "cat" -> println("animal is 🐈‍⬛ $animal")
        "bird" -> println("animal is 🕊️ $animal")
        "penguin" -> println("animal is 🐧 $animal")
        "tiger" -> println("animal is 🐯 $animal")
        "horse" -> println("animal is 🐎 $animal")
        "lion" -> println("animal is 🦁 $animal")
        in listOf("mouse", "rat") -> println("animal is 🐁 $animal")
        else -> {
            println("$animal is unknown animal to 🥺")
        }
    }
}
