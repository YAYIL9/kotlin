fun main() {
    // Solicita un número
    print("Introduce un número: ")
    val numero = readLine()?.toIntOrNull() ?: 0
    
    // Determina si es par o impar
    if (numero % 2 == 0) {
        println("El número $numero es par.")
    } else {
        println("El número $numero es impar.")
    }
}
