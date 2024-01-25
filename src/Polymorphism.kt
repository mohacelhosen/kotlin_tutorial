/*
Method name is same but it act different based on the object(which class object)

1)  Compile-time Polymorphism (Static Polymorphism):This is achieved through method overloading,
    where multiple methods in the same class have the same name but different parameters.


2)  Runtime Polymorphism (Dynamic Polymorphism):This is achieved through method overriding,
    where a subclass provides a specific implementation of a method that is already defined in its superclass.

 Note:: Method overloading and overriding is a polymorphism

Method Signature::
            1)  method name
            2)  number of parameter
            3)  parameter type
            4)  parameter sequence

 */


//Compile-time Polymorphism (Static Polymorphism): method overloading
class Calculator {
    fun add(x: Int, y: Int): Int {
        print("Int::$x, Int::$y, (x+y) = ")
        return x + y
    }

    fun add(x: Double, y: Double): Double {
        print("Double::$x, Double::$y, (x+y) = ")
        return x + y
    }

    fun add(x: Int, y: Double): Double {
        print("Int::$x, Double::$y, (x+y) = ")
        return x + y
    }

    fun add(x: Double, y: Int): Double {
        print("Double::$x, Int::$y, (x+y) = ")
        return x + y
    }
}


//Runtime Polymorphism (Dynamic Polymorphism): method overriding
// Base class
open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}

// Derived class with method override
class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle")
    }
}

// Another derived class with method override
class Square : Shape() {
    override fun draw() {
        println("Drawing a square")
    }
}

fun main() {

    val calculator =  Calculator()
    println(calculator.add(4,5))
    println(calculator.add(4.5,5))
    println(calculator.add(4,5.0))

    // Creating objects of different shapes
    val shape1: Shape = Circle()
    val shape2: Shape = Square()

    // Calling the draw method on different shape objects
    shape1.draw()  // Output: Drawing a circle
    shape2.draw()  // Output: Drawing a square
}
