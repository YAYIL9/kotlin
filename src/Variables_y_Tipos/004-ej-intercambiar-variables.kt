fun main() {
    // Solicita dos variables
    print("Introduce el valor de la primera variable: ")
    var variable1 = readLine() ?: ""
    print("Introduce el valor de la segunda variable: ")
    var variable2 = readLine() ?: ""
    
    // Intercambia los valores
    val temp = variable1
    variable1 = variable2
    variable2 = temp
    
    println("Después del intercambio, variable1: $variable1 y variable2: $variable2")
}
