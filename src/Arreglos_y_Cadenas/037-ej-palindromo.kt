fun main() {
    println("Introduce una palabra:")
    val palabra = readLine()!!
    val esPalindromo = palabra == palabra.reversed()
    if (esPalindromo) {
        println("$palabra es un palíndromo.")
    } else {
        println("$palabra no es un palíndromo.")
    }
}
