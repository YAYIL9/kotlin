fun main() {
    println("Introduce un número para verificar si es primo:")
    val n = readLine()!!.toInt()
    var esPrimo = true
    
    if (n < 2) esPrimo = false
    for (i in 2 until n) {
        if (n % i == 0) {
            esPrimo = false
            break
        }
    }
    
    if (esPrimo) {
        println("$n es un número primo.")
    } else {
        println("$n no es un número primo.")
    }
}
