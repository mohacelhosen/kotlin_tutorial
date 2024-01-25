/*
1)  Single Inheritance:: Kotlin supports single inheritance for classes
2)  Open Keyword:: By default, classes in Kotlin are final, which means they cannot be inherited.
    To allow a class for inherit, you need to declare it with the "open" keyword.
3)  Inheriting from a Class:: To inherit from a class,
    use the : (colon) symbol followed by the name of the superclass.
4)  Overriding Members:: To override a member (property or method) in a subclass, use the override keyword.
5)  Interfaces:: Kotlin supports multiple inheritance through interfaces.
    A class can implement multiple interfaces.
6)  Abstract Classes:: Kotlin also supports abstract classes, which can have abstract (unimplemented) methods.
    Subclasses are required to provide implementations for these methods.
*/

open class Animal(var name:String){
    open fun eat(){
        println("$name, can eat 😋 [Parent class method]")
    }
    fun sleep(){
        println("$name can sleep 😴")
    }
}

class Cat(name: String): Animal(name) {
    fun walk(){
        println("$name can walk 🐈‍⬛")
    }

    override fun eat(){
        println("$name, can eat 😋 ☺️ [Child class method]")
    }
}

class Tiger(name: String):Animal(name){
    fun roar(){
        super.eat()
        println("$name roar 🐯")
    }
}

interface InterfaceA {
    fun methodA()
}

interface InterfaceB {
    fun methodB()
}

class MyClass : InterfaceA, InterfaceB {
    override fun methodA() {
        // implementation for methodA
        println("methodA is implemented")
    }

    override fun methodB() {
        // implementation for methodB
        println("methodB is implemented")
    }
}

abstract class AbstractClass {
    abstract fun abstractMethod()
}

class ConcreteClass : AbstractClass() {
    override fun abstractMethod() {
        // implementation in ConcreteClass
        println("AbstractClass method is implemented from ConcreteClass")
    }
}


fun main(){
    val cat:Animal = Cat("Tom")
    val tiger:Tiger = Tiger("Tiger")
    cat.eat()
    tiger.roar()

    val objInterface:InterfaceB = MyClass()
    objInterface.methodB()

    val objAbstractClass:AbstractClass = ConcreteClass()
    objAbstractClass.abstractMethod()
}