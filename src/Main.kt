fun main() {
    println("=== Variables ===")
    var age: Int = 25
    println("Edad inicial: $age")
    age = 26
    println("Edad actualizada: $age")

    var city: String = "Bogotá"
    println("Ciudad inicial: $city")
    city = "Medellín"
    println("Ciudad actualizada: $city")

    println("\n=== Constantes ===")
    val SPEED_OF_LIGHT: Int = 299792458 // en metros por segundo
    println("La velocidad de la luz es: $SPEED_OF_LIGHT m/s")

    val EULER_NUMBER: Double = 2.71828
    println("El número de Euler es: $EULER_NUMBER")

    println("\n=== Opcionales ===")
    var optionalName: String? = "Anyi"
    println("Nombre opcional: $optionalName")
    optionalName = null
    println("Nombre opcional después de asignar null: $optionalName")

    var optionalAge: Int? = 18
    println("Edad opcional: $optionalAge")
    optionalAge = null
    println("Edad opcional después de asignar null: $optionalAge")

    println("\n=== Manejo de Nulos ===")
    var optionalTemperature: Double? = 36.5
    if (optionalTemperature != null) {
        println("La temperatura actual es: $optionalTemperature°C")
    } else {
        println("La temperatura es desconocida")
    }
}