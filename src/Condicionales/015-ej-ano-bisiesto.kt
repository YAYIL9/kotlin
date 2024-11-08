fun main() {
    print("Ingrese un año: ")
    val year = readLine()!!.toInt()

    val esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

    if (esBisiesto) {
        println("El año $year es bisiesto")
    } else {
        println("El año $year no es bisiesto")
    }
}
