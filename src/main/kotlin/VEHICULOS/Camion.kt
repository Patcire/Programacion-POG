package VEHICULOS

class Camion:Vehiculo_carga {

    //por parámetros
    constructor(matricula_transporte:String, dias_transporte:Int, tara: Int)
            :super(matricula_transporte, dias_transporte, tara)

    //constructor por defecto
    constructor():this("0000zzz", 4, 30)

    override fun calcular_alquiler(): Double {
        var calculo=dias_alquiler*50+20*tara+40
        return calculo.toDouble()
    }

    override fun recibo() {
        super.recibo()
        println("--------" +
                "CAMIÓN" +
                "---------")
    }

}