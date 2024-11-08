fun main() {
    // Solicita tres números
    print("Introduce el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Introduce el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Introduce el tercer número: ")
    val num3 = readLine()?.toDoubleOrNull() ?: 0.0
    
    // Calcula el promedio
    val promedio = (num1 + num2 + num3) / 3
    println("El promedio de $num1, $num2 y $num3 es: $promedio")
}
