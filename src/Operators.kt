/*
Assignment operator
----------------------
1) assignment operator ( = ) single equal
It is used to assign a value into a variable


Arithmetic operators
----------------------
1)  + - * / (Math)
2)  Modulus Operator (%)

Example : 9 % 2 = 1 (reminder)
Why? Because  9/2 = 4 (quotient) and reminder(1) which is modulus


Relational Operators
---------------------
1)  Greater than ( > )
2)  Less than ( < )
3)  Greater than Equal to ( >= )
4)  Less than Equal to ( <= )
5)  Equals to ( == ) double equal
6)  Not Equals ( != )


Pre/Post Increment( original value + 1) and Pre/Post Decrement ( original value - 1)
----------------------------------
1) ++numberX (pre-increment because ++ is used before the variable name)
2) numberX++ (post-increment because ++ is used after the variable name)
3) --numberX (pre-decrement because ++ is used before the variable name)
4) numberX-- (post decrement because ++ is used after the variable name)
Note: post-mean first use value than increment or decrease the value.


Logical Operators
---------------------
1)  &&  (AND)
2)  ||  (OR)
3)  !   (NOT)
Note:
    false && true = false (If any of them are false, the 'AND' operator result will be false.)
    false || true = true (If any of them are true, the 'OR' operator result will be true.)
    !false = true (The 'NOT' operator is used to make the value = opposite the value.)

 */

fun main(){
    var numberX = 11
    var numberY = 5
    var numberZ = 5.0
    var above13 = false
    var knowProgramming = true


    println("numberX = $numberX, numberY = $numberY, numberZ = $numberZ")
    println("---------------- Arithmetic operators --------------------")
    println( numberX + numberY)     // 16
    println( numberX - numberY)     // 6
    println( numberX * numberY)     // 55
    println( numberX / numberY)     // 2 (Int / Int = Int)
    println( numberX / numberZ)     // 2.2 (Int / Float = Float) || (Float / Int = Float)
    println( numberX % numberY)     // 1


    println("---------------- Relational Operators (true or false) --------------------")
    println("numberX = $numberX, numberY = $numberY")
    println( numberX > numberY)     //true
    println( numberX < numberY)     //false
    println( numberX >= numberY)    //true
    println( numberX <= numberY)    //false
    println( numberX == numberY)    //false
    println( numberX != numberY)    //true


    println("---------------- Pre/Post Increment and Pre/Post Decrement --------------------")
    println("Previous numberX = $numberX")  //11
    println( ++numberX)     //12
    println("After pre-increment numberX = $numberX")   //12
    println( numberX++)    //12
    println("After post-increment numberX = $numberX")  //13

    println("Previous numberY = $numberY")      //5
    println( --numberY)     //4
    println("After pre-decrement numberX = $numberY")   //4
    println( numberY--) //4
    println("After post-decrement numberX = $numberY")  //3


    println("---------------- Logical Operators --------------------")
    println("above13 = $above13, knowProgramming = $knowProgramming")
    var allow = above13 && knowProgramming      // AND(&&)
    println("$above13 && $knowProgramming = $allow")        //  false && true = false
    println("Allow for coding competition =  $allow")       //  false

    allow = above13 || knowProgramming      // OR(||)
    println("$above13 || $knowProgramming = $allow")        //  false || true = true
    println("Allow for coding competition  =  $allow")      //  true

    allow = !above13   // NOT(!)
    println("!$above13 = $allow")   //  !false = true
    println("Allow for coding competition  =  $allow")      //  true


}