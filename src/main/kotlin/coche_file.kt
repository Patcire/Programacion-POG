fun main(args: Array<String>) {

    val coche1= coche("verde","suzuki","sport",200,5, "22ty")
    val coche2= coche("azul","mini","cactus",120, 5)

    println(coche1.toString())
    println(coche2.toString())

    println("Introduzca el nuevo color del coche1:\n")
    //var nuevo_color= readln()
    coche1.color= readln()

    //println("Introduzca el nuevo color del coche2:\n")
    //nuevo_color= readln()
    //coche2.color=nuevo_color

    print(coche1.toString())
    println()
    print(coche2.toString())
}