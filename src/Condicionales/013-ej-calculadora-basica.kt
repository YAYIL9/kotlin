fun main() {
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toDouble()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toDouble()
    print("Ingrese la operación (+, -, *, /): ")
    val operacion = readLine()!!

    val resultado = when (operacion) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Error: División por cero"
        else -> "Operación inválida"
    }

    println("El resultado es: $resultado")
}
