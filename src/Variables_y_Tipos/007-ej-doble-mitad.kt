fun main() {
    // Solicita un número
    print("Introduce un número: ")
    val numero = readLine()?.toDoubleOrNull() ?: 0.0
    
    // Calcula el doble y la mitad
    val doble = numero * 2
    val mitad = numero / 2
    println("El doble de $numero es: $doble y la mitad es: $mitad")
}
