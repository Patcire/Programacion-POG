package VEHICULOS

abstract class Vehiculo_transporte:Vehiculo {


    var num_plazas=2
        get() {
            return field
        }
        set(value) {
            if(num_plazas<2){
                println("Error, el vehículo de transporte debe tener al menos 2 plazas\n")
            }
            else{
                field=value
            }
        }

    //CONSTRUCTOR SECUNDARIO PERO COMPLETO

    //por parámetro le pasamos los parámetros dque son necesario pasarles a la clase padre
    //y el nuevo parámetro de la clase hija, en este caso plazas
    constructor(matricula_transporte:String, dias_transporte:Int, plazas: Int)
            :super(matricula_transporte, dias_transporte){
                num_plazas=plazas
            }

    //constructor solo con el parámetro plaza
    constructor(plazas: Int):super("0000ZZZ",2){
        num_plazas=plazas
    }

    //constructor por defecto
    constructor():this(4)


    abstract override fun calcular_alquiler(): Double
    override fun recibo() {
        println("Recibo:\n" +
                "Matrícula: $matricula\n" +
                "Duración: $dias_alquiler\n" +
                "Plazas: $num_plazas\n" +
                "Importe: ${calcular_alquiler()}\n")

    }

    /*
    init{
        num_plazas=plazas
    }
    */

}