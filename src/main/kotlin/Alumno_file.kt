fun main(args: Array<String>) {

    val Alumno1 = Alumno("2020ty", 22)

    println("Introduzca la nota del 1º trimestre\n")
    Alumno1.nota1 = readln().toInt()
    println("Introduzca la nota del 2º trimestre\n")
    Alumno1.nota2 = readln().toInt()
    println("Introduzca la nota del 3º trimestre\n")
    Alumno1.nota3 = readln().toInt()

    //ahora para que actualice y pase por el init
    //actualizo una variable que vuelvo a pedir
    println("Te equivocaste de alumno. Introduzca la verdadera nota del 3º trimestre de este alumno\n")

    println(Alumno1.toString())

    val Alumno2 = Alumno("1010we", 99, 3, 3)
    println(Alumno2.toString())

    val Alumno3 = Alumno("4444gh", 57, 10,)
    println(Alumno3.toString())

    val Alumno4 = Alumno("0000ff", 33)
    println(Alumno4.toString())

    //si quiero que alumno5 sea una copia de alumno 5
    val Alumno5 = Alumno(Alumno1)

}


