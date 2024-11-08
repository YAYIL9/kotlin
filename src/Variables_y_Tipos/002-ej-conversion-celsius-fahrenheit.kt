fun main() {
    // Solicita una temperatura en Celsius
    print("Introduce la temperatura en grados Celsius: ")
    val celsius = readLine()?.toDoubleOrNull() ?: 0.0
    
    // Conversión a Fahrenheit
    val fahrenheit = (celsius * 9/5) + 32
    println("$celsius grados Celsius equivalen a $fahrenheit grados Fahrenheit.")
}
