package HERENCIA

fun main(args: Array<String>) {

    var prog1= Programador("Pepe", "Pérez Jazmín", "12131415X", "21/12/2022",
        1200.50, 14.5, 2)

    var direc1= Directivo("Lucía", "Astorga García", "21222324R", "12/12/12",
        5000.0, 20.0, 10, 200.0, 90.0, "Directora de Comercio")


    direc1.imprimir_nomina()

    println(prog1.pedir_vacas())
    println(prog1.pedir_aumento())
    prog1.imprimir_nomina()
}