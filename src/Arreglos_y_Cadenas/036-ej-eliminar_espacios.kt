fun main() {
    println("Introduce una cadena:")
    val cadena = readLine()!!
    val cadenaSinEspacios = cadena.replace(" ", "")
    println("La cadena sin espacios en blanco es: $cadenaSinEspacios")
}
