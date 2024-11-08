fun main() {
    print("Ingrese su edad: ")
    val edad = readLine()!!.toInt()

    if (edad >= 18) {
        println("Puede votar")
    } else {
        println("No puede votar")
    }
}
