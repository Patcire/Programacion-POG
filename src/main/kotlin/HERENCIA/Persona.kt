package HERENCIA

open class Persona (Nombre:String, Apellidos: String, DNI: String) {

    protected var nomb=""
        get(){
            return field
        }


    protected var apell=""
        get(){
            return field
        }

        set(value) {
            if (value.length<5 || value.length>45){
                println("Error. Los apellidos no pueden tener menos de 5 caracteres ni más de 45\n")
            }
            else{
                field = value
            }

        }

    protected var dni=""
        get(){
            return field
        }

        set(value) {
            if (value.length != 9){
                println("Error. el dni debe tener una longitud de 9 caracteres. 8 números y una letra\n")
            }
            else{
                field = value
            }

        }

    init{
        nomb=Nombre
        apell=Apellidos
        dni=DNI
    }

    //constructor por defecto
    constructor(): this ("defecto","ninguno", "123456789")


    fun mostrar_info(){
        println("La siguiente persona tiene:"+
                "DNI: $dni"+
                "Nombre: $nomb"+
                "Apellidos: $apell")
    }

}