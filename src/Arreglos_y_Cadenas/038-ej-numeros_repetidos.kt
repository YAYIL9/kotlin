fun main() {
    val numeros = intArrayOf(1, 2, 3, 2, 4, 1, 5)
    val repetidos = numeros.groupBy { it }.filter { it.value.size > 1 }.keys
    println("Números repetidos en el array: $repetidos")
}
