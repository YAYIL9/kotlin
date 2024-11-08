fun main() {
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()

    val mayor = if (num1 > num2) num1 else num2
    println("El mayor es: $mayor")
}
