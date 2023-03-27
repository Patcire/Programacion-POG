package VEHICULOS

class Bus:Vehiculo_transporte {

    //por parámetros
    constructor(matricula_transporte:String, dias_transporte:Int, plazas: Int)
            :super(matricula_transporte, dias_transporte, plazas)

    //constructor por defecto
    constructor():this("0000zzz", 4, 30)

    override fun calcular_alquiler(): Double {
        var calculo=dias_alquiler*50+(1.5*num_plazas*dias_alquiler)+(2*num_plazas)
        return calculo
    }

    override fun recibo() {
        super.recibo()
        println("--------" +
                "BUS" +
                "---------")
    }
    override fun toString(): String { //solo para ficheros_act4
        return "Bus#"+ super.toString()
    }

}