
fun main(){
    print("Enter number:: ")
    val userInput = readlnOrNull()?.toIntOrNull()?:0
    println("You have entered:: $userInput")
}