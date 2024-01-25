
fun main(){
    println("Room temperature in normal:: ${temperatureC2F()} degree Fahrenheit")

    print("Enter your room temperature in Celsius:: ")
    var celsiusTemperature = readlnOrNull()?.toIntOrNull()?:0
    println("Room temperature in Fahrenheit:: ${temperatureC2F(celsiusTemperature)} degree Fahrenheit")

    print("Enter your body temperature in Fahrenheit:: ")
    val fahrenheitTemperature = readlnOrNull()?.toDoubleOrNull()?:0.0
    println("Body temperature in Celsius:: ${temperatureF2C(fahrenheitTemperature)} degree Celsius")

}

fun temperatureC2F(celsius: Int = 25): Double {
    val fahrenheit = (celsius * 9 / 5.0) + 32
    return fahrenheit
}

fun temperatureF2C(fahrenheit: Double): Int {
    val celsius = ((fahrenheit - 32) * 5 / 9).toInt()
    return celsius
}
