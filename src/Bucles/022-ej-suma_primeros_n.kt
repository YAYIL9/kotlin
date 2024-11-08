fun main() {
    println("Introduce un número n:")
    val n = readLine()!!.toInt()
    var suma = 0
    for (i in 1..n) {
        suma += i
    }
    println("La suma de los primeros $n números es: $suma")
}
