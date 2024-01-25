class User(nameParam:String, hobbiesParam:Array<String>){
    var name:String = nameParam
        get() = field
        set(value){field=value.uppercase()}

    var hobbies = hobbiesParam
        get(){
           return field.map { it.uppercase() }.toTypedArray()
        }
}

fun main(){
    val obj = User("Mohacel", arrayOf("Football","Online Game", "Adventure", "Cycling"))
    println(obj.name)
    obj.name="Mohacel Hosen"

    println(obj.name)
    println(obj.hobbies.joinToString())
}