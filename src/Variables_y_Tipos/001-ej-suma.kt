fun main() {
    // Solicita dos números al usuario
    print("Introduce el primer número: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Introduce el segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 0
    
    // Realiza la suma
    val suma = num1 + num2
    println("La suma de $num1 y $num2 es: $suma")
}
