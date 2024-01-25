import com.sun.jdi.IntegerType

class Person(private var name: String, private var gender: String) {

    private lateinit var hobby: Array<String> // lateinit cannot be used with primitive types directly, including wrapper classes
    private var age: Int = 0
//    private lateinit var age:Int
//    private lateinit var balance:Double
//    private lateinit var height:Float
//    private lateinit var single:Boolean

    constructor(name: String, age: Int, gender:String, hobby:Array<String>):this("","") {
        this.name=name
        this.gender = gender
        this.hobby = hobby
        this.age = age
    }
    fun about() {
        if (::hobby.isInitialized ) {
            println("Name: $name, Age: $age, Gender: $gender, Hobbies: ${hobby.joinToString()}")
        } else {
            println("Name: $name, Gender: $gender,  Age and Hobbies : Not specified")
        }
    }
}



fun main(){
   val user1 = Person("Mohacel", 23,"Male", arrayOf("Football, Online Multiplayer Games, Adventure") )
   val user2 = Person("Megh", "Female")

    user1.about()
    user2.about()

}