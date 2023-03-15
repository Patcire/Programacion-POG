package VEHICULOS

abstract class Vehiculo_carga:Vehiculo {

    //en toneladas
    var tara=1
        get() {
            return field
        }
        set(value) {
            if(tara<1){
                println("Error, el peso no puede ser menor que 1 tonelada\n")
            }
            else{
                field=value
            }
        }

    constructor(matricula_transporte:String, dias_transporte:Int, tara_carga: Int)
            :super(matricula_transporte, dias_transporte){
        tara=tara_carga
    }

    //constructor solo con el parámetro plaza
    constructor(tara_carga: Int):super("0000ZZZ",2){
        tara=tara_carga
    }

    abstract override fun calcular_alquiler(): Double
    override fun recibo() {
        println("Recibo:\n" +
                "Matrícula: $matricula\n" +
                "Duración: $dias_alquiler\n" +
                "Tara: $tara\n" +
                "Importe: ${calcular_alquiler()}\n")
    }

}