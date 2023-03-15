package RELOJERIA

open class Reloj(hora:Int, minuto:Int, segundo: Int) {

    protected var h=0
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
    protected  var m=0
        get(){
            return field
        }
    ///////////////
        set(value) {
        var horas_a_sumar=0
            if (value<0){
                println("Error. los minutos no pueden ser negativos\n")
            }
            if(value>59){
                field=value%60
                horas_a_sumar=value/60

                while (h<23) {
                    for (i in 1..horas_a_sumar) {
                        h+=1
                        horas_a_sumar-=1
                    }
                    break
                }
                h=0
                }
            else{
                field = value
            }

        }
    protected  var s=0
        get(){
            return field
        }

        set(value) {
            if (value<0 ){
                println("Error. los segundos NO PUEDEN SER NEGATIVOS\n")
            }
            if (value>59){
                field=value%60
                m+=value/60
            }
            else{
                field = value
            }

        }
    init {
        h=hora
        m=minuto
        s=segundo
    }

    //esta función solo era por si quería crear un constructor que recibe un objeto
    fun devueveHora():Int{
        return h
    }



    //constructor por defecto
    constructor(): this(0, 0, 0)

    //Si hiciera otro método que no recibiese por parámetros y tuviese los dos, estaría sobrecargando el método
    //porque habría 2 versiones de un mismo método, pero se puede

    open fun set_time(hor_nueva:Int, min_nueva: Int, seg_nueva: Int){
        h=hor_nueva
        m=min_nueva
        s=seg_nueva
    }

    //display
    open fun mostrar_hora(){
        println("Son las: $h horas $m minutos y $s segundos")
    }


    //funciona bien. Probado con cambios de segundos a minutos, minutos a horas y reinicio de horas o 00:00:00
    /*
    open fun incremento_un_segundo(){
        if (s<59){
            s+=1
        }
        else{
            s=0
            if (m<59) {
                m+=1
            }
            else{
                m=0
                if (h<23){
                h+=1
                }
                else{
                    h=0
            }
            }
        }

    }

     */
    open fun incremento_un_segundo() {
    s+=1
    }


}