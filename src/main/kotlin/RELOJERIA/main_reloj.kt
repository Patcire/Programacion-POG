package RELOJERIA

fun main(args: Array<String>) {

    var reloj_ejemplo=Reloj()
    reloj_ejemplo.set_time(23,35,23)

    for (i in 1..10000 ){
        reloj_ejemplo.incremento_un_segundo()
        reloj_ejemplo.mostrar_hora()
    }

}