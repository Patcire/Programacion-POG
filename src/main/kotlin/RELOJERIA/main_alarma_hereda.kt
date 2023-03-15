package RELOJERIA

fun main(args: Array<String>) {


    var alarma_reloj_heredado_ejemplo1=Alarma_hereda_reloj()
    alarma_reloj_heredado_ejemplo1.set_time(18,35,23)
    alarma_reloj_heredado_ejemplo1.set_alarma(18,52)

    for (i in 1..2000){
        alarma_reloj_heredado_ejemplo1.incremento_un_segundo()
        alarma_reloj_heredado_ejemplo1.mostrar_hora()
    }


}