fun main() {
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()

    var resultado = 0
    repeat(num2) {
        resultado += num1
    }

    println("El resultado es: $resultado")
}
