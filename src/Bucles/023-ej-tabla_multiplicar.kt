fun main() {
    println("Introduce un número para la tabla de multiplicar:")
    val numero = readLine()!!.toInt()
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}
