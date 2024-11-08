fun main() {
    // Solicita la distancia en metros
    print("Introduce la distancia en metros: ")
    val metros = readLine()?.toDoubleOrNull() ?: 0.0
    
    // Conversión a kilómetros
    val kilometros = metros / 1000
    println("$metros metros equivalen a $kilometros kilómetros.")
}
