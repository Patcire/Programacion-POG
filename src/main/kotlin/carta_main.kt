fun main(args: Array<String>) {

    val carta1= Carta(3, "R")
    carta1.mostrar()
    val carta2=Carta(7, "P")
    carta2.mostrar()

    println()
    carta1.comparar(carta2)
    println()

    println("Modifique el nº de la segunda carta\n")
    carta2.num= readln().toInt()
    println("Y ahora el palo\n")
    carta2.palo= readln().toString()

    carta1.mostrar()
    carta2.mostrar()
    carta1.comparar(carta2)
}