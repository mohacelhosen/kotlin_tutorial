
/*
readlnOrNull = it returns null if there is an issue or if the input is empty otherwise return  input stream(user input)
safe call operator(?.) = only accessible on the right side function() when it's not null; if it's null, then the right side function() will never be executed.
elvis operator (?:) = It is used to provide a default value when the expression on its left side is null.

    val result = expressionThatMightBeNull ?: defaultValue

 */
fun main(){
    print("Enter number:: ")
    val userInput = readlnOrNull()?.toIntOrNull()?:0
    println("You have entered:: $userInput")
}