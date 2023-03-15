package HERENCIA

open class Empleado : Persona {

    protected var fecha=""
        get(){
            return field
        }

        set(value) {
            var lista_fecha= value.split("/")
            if ((lista_fecha[2])<"1950" || (lista_fecha[2])>"2023"){
                println("Error. el dni debe tener una longitud de 9 caracteres. 8 números y una letra\n")
            }
            else{
                field = value
            }

        }

    protected var sueldo=0.0
        get(){
            return field
        }

        set(value) {
            if (value<=0){
                println("Error. el sueldo debe ser mayor que 0")
            }
            else{
                field = value
            }

        }

    protected var base_extras=10.0
        get(){
            return field
        }

        set(value) {
            if (value<10){
                println("Error, la base no puede ser menor que 10\n")
            }
            else{
                field = value
            }

        }

    protected var num_extras=0
        get(){
            return field
        }

        set(value) {
            field = value
            }




    //constructor por parámetros
    constructor(Nombre:String, Apellidos: String, DNI: String, fecha_contrato: String,
                sueldo_base : Double, base_horas_extras : Double, num_horas_extra:Int):super(Nombre, Apellidos, DNI){

                    fecha=fecha_contrato
                    sueldo=sueldo_base
                    base_extras=base_horas_extras
                    num_extras=num_horas_extra
                }

    //constructor por defecto
    constructor(): this ("defecto","ninguno", "123456789", "sin fecha", 0.0,
                            0.0, 0)


    open fun calcular_sueldo():Double{

        var sueldo_total=sueldo+(base_extras*num_extras)
        return sueldo_total
    }
}

