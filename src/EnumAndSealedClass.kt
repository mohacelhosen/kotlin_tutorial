/*
1)  Enum Class::An enum class is a special kind of class that represents a fixed set of constants or values.
    Each constant in an enum class is an instance of that class and is typically used to represent a distinct value.

2)  Sealed Class::A sealed class is used to represent a restricted hierarchy of classes.
    It is similar to an abstract class, but with a limited set of subclasses defined within the same file.
    The subclasses must be declared within the same file as the sealed class, making the hierarchy closed.
 */


enum class Day{
    MONDAY,TUESDAY,WEDNESDAY,FRIDAY,SATURDAY
}


sealed class Result{
    data class Success(val data:String):Result()
    data class Error(val message:String):Result()
}

fun handleResult(result: Result){
    when(result){
        is Result.Success -> println("Success: ${result.data}")
        is Result.Error -> println("Error: ${result.message}")
    }
}

fun main() {

    print("Enter your off day:: ")
    val userOffDay = readlnOrNull()?.trim()?.split(" ")?.get(0)
    //enumValues<Day>() retrieves an array containing all the enum constants of the Day enum class.
    if (enumValues<Day>().any(){it.name.equals(userOffDay, ignoreCase = true)}){
        println("You are allow to take off ${userOffDay?.uppercase()}")
    }else{
        println("You are not allow to take off ${userOffDay?.uppercase()}")
    }

    println("-----------------------------------------------------------")

    val successResult = Result.Success("Data fetched successfully")
    val errorResult = Result.Error("Failed to fetch data")

    handleResult(successResult)
    handleResult(errorResult)
}
