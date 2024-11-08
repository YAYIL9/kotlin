fun main() {
    println("Introduce un número entero:")
    val numero = readLine()!!
    var suma = 0
    for (digito in numero) {
        suma += digito.toString().toInt()
    }
    println("La suma de los dígitos es: $suma")
}
