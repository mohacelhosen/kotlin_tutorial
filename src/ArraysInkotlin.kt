/*
Immutable (Read-only) Arrays:: Immutable arrays are read-only,
meaning you cannot change their size or modify elements once they are initialized.
They are created using the arrayOf function.

Mutable Arrays:: Mutable arrays allow you to change their size and modify elements.
They are created using the mutableListOf(), mutableSetOf(), or mutableMapOf() functions.

 */

fun main(){
    var numbers = arrayOf(1,2,3,4,5)
    println("Original Immutable Array:: ${numbers.joinToString()}")

    val mutableNumbers = mutableListOf(1, 2, 3, 4, 5)
    println("Original Mutable Array:: ${mutableNumbers.joinToString()}")
    mutableNumbers.add(7)
    mutableNumbers.add(9)
    mutableNumbers.add(0, 6)
    mutableNumbers[2]=33
    println("After adding 4 element in Mutable Array:: ${mutableNumbers.joinToString()}")

    val fruits = arrayOf(
        "Apple", "Banana", "Orange", "Mango", "Pineapple",
        "Grape", "Strawberry", "Watermelon", "Kiwi", "Papaya",
        "Peach", "Plum", "Cherry", "Raspberry", "Blueberry",
        "Blackberry", "Pear", "Lemon", "Lime", "Avocado"
    )
    fruits.forEachIndexed { index, element -> println("$index - $element") }

    print("Searching fruit name:: ")
    val fruit = readlnOrNull()?:"Apple"
    println("You have searched \"$fruit\"")
    if(fruits.contains(fruit)){
        println("We have found your favorite fruit in out bucket ☺️")
        println("Your fruit at index ::${fruits.indexOf(fruit)}")
    }else{
        println("Sorry😔 we don't have \"$fruit\"")
    }
}