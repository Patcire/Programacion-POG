package VEHICULOS

abstract class Vehiculo(matricula: String, dias: Int) {

    var matricula="1234zzz"
        get() {
            return field
        }
        set(value) {
            if(matricula.length!=7){
                println("Error el formato de matrícula debe ser, en orden: 4 números y 3 letras\n")
            }
            else{
                field=value
            }
        }
    var dias_alquiler=2
        get() {
            return field
        }
        set(value) {
            if(dias_alquiler<=0){
                println("Error, un alquiler debe de ser de al menos 1 día\n")
            }
            else{
                field=value
            }
        }

    //constructor por defecto
    constructor():this("0000XCZ", 2)

    abstract fun calcular_alquiler():Double
    abstract fun recibo()

    init{
        this.matricula=matricula
        dias_alquiler=dias
    }
}