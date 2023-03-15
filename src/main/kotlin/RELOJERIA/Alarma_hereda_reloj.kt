package RELOJERIA

class Alarma_hereda_reloj : Reloj{

    var hora_alarma=0

        get(){
            return field
        }

        set(value) {
            if (value<0 || value>23){
                println("Error. las horas deben estar comprendidos entre 0 y 23\n")
            }
            else{
                field = value
            }

        }

    var minuto_alarma=0

        get(){
            return field
        }

        set(value) {
            if (value<0 || value>59){
                println("Error. los minutos deben estar comprendidos entre 0 y 59\n")
            }
            else{
                field = value
            }

        }

    //constructor por parámetros, donde la hora del reloj y el de la alarma son distintas

    constructor(hora:Int, minuto:Int, segundo: Int, Hora_alarma:Int, Minuto_alarma:Int):super(hora, minuto, segundo){
        hora_alarma=Hora_alarma
        minuto_alarma=Minuto_alarma
    }

    //constructor por parámetros, donde la hora del reloj y el de la alarma son iguales
    /*
    constructor(hora:Int, minuto:Int, segundo: Int, Hora_alarma: Int):super(hora, minuto, segundo){
        hora_alarma=hora
        minuto_alarma=minuto
    }



    constructor llamando al objeto. Solo que si tengo las características protected tengo que tener métodos que devuelvan
    esos valores

    constructor(r:Reloj,hora_alarma2:Int,minuto_alarma2:Int):super(r.devueveHora(), minuto, segundo){
        //hora_alarma=hora_alarma2
        //minuto_alarma=minuto_alarma2
    }

    */

    //constructor por defecto
    constructor(): this(0,0,0,0,0)


    open fun set_alarma(h: Int, m: Int){
        hora_alarma=h
        minuto_alarma=m

    }


    override fun incremento_un_segundo() {
        if (super.h == hora_alarma && super.m == minuto_alarma && super.s==0 ) {
            println("Alarma sonando\n")
        }
        super.incremento_un_segundo()

    }


}
