fun main() {
    print("Ingrese una calificación (0-100): ")
    val calificacion = readLine()!!.toInt()

    val letra = when {
        calificacion >= 90 -> "A"
        calificacion >= 80 -> "B"
        calificacion >= 70 -> "C"
        calificacion >= 60 -> "D"
        else -> "F"
    }

    println("La calificación en letra es: $letra")
}
