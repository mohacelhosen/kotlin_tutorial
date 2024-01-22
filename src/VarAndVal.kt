/*
val = reassign not possible ❌
var = reassign possible ✅


val = it is used for declaring immutable (read-only) variables.
Once a value is assigned to a val, it cannot be reassigned.

var = it is used for declaring mutable variables.
The value of a var can be reassigned.

 */
fun main() {
    val organizationName: String = "Coding Universe"
    var coderName = "Mohacel Hosen" // Type inference is used here
    var rank = 5
    var score = 60
    var mentor = true

    rank = 3
    score = 90
}
