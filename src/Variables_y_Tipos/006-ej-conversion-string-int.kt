fun main() {
    // Solicita una cadena
    print("Introduce un número en formato texto: ")
    val input = readLine() ?: ""
    
    // Intenta convertir a número
    try {
        val numero = input.toInt()
        println("El número convertido es: $numero")
    } catch (e: NumberFormatException) {
        println("Error: La cadena introducida no es un número válido.")
    }
}
