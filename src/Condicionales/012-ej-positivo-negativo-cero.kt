fun main() {
    print("Ingrese un número: ")
    val numero = readLine()!!.toInt()

    when {
        numero > 0 -> println("El número es positivo")
        numero < 0 -> println("El número es negativo")
        else -> println("El número es cero")
    }
}
