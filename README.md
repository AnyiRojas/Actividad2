# Kotlin 

Este proyecto en Kotlin contiene ejemplos simples para entender el uso de variables, constantes, opcionales y manejo de nulos.


## Descripción

El código incluido en este proyecto proporciona ejemplos sobre cómo trabajar con diferentes aspectos del lenguaje Kotlin aun que sea desarrollado en Intellij IDEA:

- **Variables**: Declarar y actualizar variables mutables para almacenar y modificar datos durante la ejecución del programa.

- **Constantes**: Declarar constantes inmutables y su uso en situaciones donde el valor asignado no cambia a lo largo del ciclo de vida del programa.

- **Opcionales**: Trabajar con variables que pueden contener un valor nulo (`null`) utilizando el tipo de dato opcional (`Tipo?`), permitiendo manejar casos donde la presencia o ausencia de datos es incierta.

- **Manejo de Nulos**: Verificar y manejar de manera segura las variables que pueden ser nulas.


## Contenido

El proyecto está estructurado de la siguiente manera:

- `main.kt`: Contiene el código Kotlin principal con ejemplos de variables, constantes, opcionales y manejo de nulos.
- `README.md`: Termina siendo este archivo, que proporciona información sobre el proyecto y cómo funciona de cierta manera.

## Ejemplos

### Variables
```
fun main() {

    var age: Int = 25
    println("Edad inicial: $age")
    age = 26
    println("Edad actualizada: $age")

    var city: String = "Bogotá"
    println("Ciudad inicial: $city")
    city = "Medellín"
    println("Ciudad actualizada: $city")
}
```
### Constantes
```
fun main() {
    val SPEED_OF_LIGHT: Int = 299792458
    println("La velocidad de la luz es: $SPEED_OF_LIGHT m/s")

    val EULER_NUMBER: Double = 2.71828
    println("El número de Euler es: $EULER_NUMBER")
}
```

### Opcionales
```
fun main() {
    var optionalName: String? = "Anyi"
    println("Nombre opcional: $optionalName")
    optionalName = null
    println("Nombre opcional después de asignar null: $optionalName")

    var optionalAge: Int? = 18
    println("Edad opcional: $optionalAge")
    optionalAge = null
    println("Edad opcional después de asignar null: $optionalAge")
}
```

### Manejo de nulos
```
fun main() {
    var optionalTemperature: Double? = 36.5
    if (optionalTemperature != null) {
        println("La temperatura actual es: $optionalTemperature°C")
    } else {
        println("La temperatura es desconocida")
    }
}
```
## Ejecución
Para poder ejecutar estos ejemplos, puedes abrir el archivo main.kt en IntelliJ IDEA u otro entorno de desarrollo compatible con Kotlin. Utiliza el botón de ejecución o el atajo de teclado correspondiente para ejecutar el código claro antes de poder hacer esto debes abrir el repositorio.


## Contribución
Puedes aportar a este proyecto añadiendo más ejemplos, mejorando la documentación o extendiendo la funcionalidad de los ejemplos existentes despues de todo con cada granito de arena se puede generar algo muy bueno y de paso completo.


## Autor
Anyi Camila Mendivelso Rojas
13 - Noviembre - 2024
