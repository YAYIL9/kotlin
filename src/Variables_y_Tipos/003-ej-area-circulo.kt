fun main() {
    // Solicita el radio del círculo
    print("Introduce el radio del círculo: ")
    val radio = readLine()?.toDoubleOrNull() ?: 0.0
    
    // Calcula el área del círculo
    val area = Math.PI * radio * radio
    println("El área del círculo con radio $radio es: $area")
}
