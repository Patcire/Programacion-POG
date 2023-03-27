package VEHICULOS

class Coche:Vehiculo_transporte {

    //por parámetros
    constructor(matricula_transporte:String, dias_transporte:Int, plazas: Int)
            :super(matricula_transporte, dias_transporte, plazas)

    //constructor por defecto
    constructor():this("0000zzz", 4, 4)


    override fun calcular_alquiler(): Double {
        var calculo=dias_alquiler*50+(1.5*num_plazas*dias_alquiler)
        return calculo
    }

    override fun recibo() {
        super.recibo()
        println("--------" +
                "COCHE" +
                "---------")
    }

    override fun toString(): String {
        return "Coche#"+ super.toString()
    }
}