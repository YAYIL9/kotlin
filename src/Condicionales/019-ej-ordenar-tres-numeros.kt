fun main() {
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese el tercer número: ")
    val num3 = readLine()!!.toInt()

    val numeros = listOf(num1, num2, num3).sorted()
    println("Números ordenados: ${numeros[0]}, ${numeros[1]}, ${numeros[2]}")
}
