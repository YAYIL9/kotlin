fun main() {
    // Solicita un número del 1 al 7
    print("Introduce un número del 1 al 7: ")
    val dia = readLine()?.toIntOrNull() ?: 0
    
    // Determina el día de la semana
    val diaSemana = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Número no válido. Debe ser entre 1 y 7."
    }
    
    println("El día de la semana es: $diaSemana")
}
