fun main() {
    println("Introduce un número para calcular su factorial:")
    val n = readLine()!!.toInt()
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("El factorial de $n es: $factorial")
}
