fun main() {

    val fruits = mapOf(
        "Apple" to "🍎 Crisp and sweet",
        "Banana" to "🍌 Soft and sweet",
        "Orange" to "🍊 Citrusy and refreshing",
        "Mango" to "🥭 Ripe Mango is sweet",
        "Pineapple" to "🍍 Tangy and juicy",
        "Grape" to "🍇 Sweet and juicy",
        "Strawberry" to "🍓 Sweet and tart",
        "Watermelon" to "🍉 Juicy and hydrating",
        "Kiwi" to "🥝 Tart and refreshing",
        "Papaya" to "🍈 Sweet and tropical",
        "Peach" to "🍑 Juicy and fragrant",
        "Cherry" to "🍒 Sweet with a hint of tartness",
        "Raspberry" to "🍇 Sweet and delicate",
        "Blueberry" to "🫐 Sweet and antioxidant-rich",
        "Pear" to "🍐 Juicy and mild",
        "Lemon" to "🍋 Sour and tangy",
        "Avocado" to "🥑 Creamy and nutty"
    )


    val fruitList: ArrayList<String> = arrayListOf()
    var index = 1

    for (fruit in fruits) {
        fruitList.add("$index. ${fruit.key} - ${fruit.value}")
        index++
    }

    print("After each fruit how many fruits u want to skip to see (0 - 17):: ")
    var skip = readlnOrNull()?.toIntOrNull() ?: 1
    if (skip ==1 || skip == 0) skip=1
    for (i in 0 until fruits.size step skip){
        println(fruitList.get(i))
    }


    print("Enter your favorite fruit name:: ")
    val userInput = readlnOrNull()?.trim()?.split(" ")?.get(0)
    var found = false
    for (fruit in fruits) {
        if (userInput?.lowercase().equals(fruit.key.lowercase())) {
            println(fruit.value)
            found = true
            break
        }
    }
    if (found == false) {
        println("Sorry we are unable to find 🙇‍♀️")
    }
}
