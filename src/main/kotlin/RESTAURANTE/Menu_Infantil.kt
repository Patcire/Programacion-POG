package RESTAURANTE

open class Menu_Infantil: Menu {

    var regalos_lista= listOf<String>("muñeca", "soldado")
    var regalo_cliente=""
        get(){
            return field
        }
        set(value) {
            if (value.lowercase() !in regalos_lista) {
                println("Error. No tenemos ese regalo\n")
            }
            else {
                field = value
            }
        }


    //constructor por parámetros excepto IVA y descuento, que no se incluyen en el constructor
    // por ser comunes a todos los menús

    constructor( principal: String, bebida: Int, postre: Int, regalo: String):super
        (0.21F, 0.25F, principal, bebida, postre){

        //en el constructor de la clase hija, que lo hago secundario, solo
        //enlazo los atributos y variables que no tenía la clase padre

            regalo_cliente=regalo


            //En vez de Vino se ofrece Zumo. Cambiamos el valor correspondiente a vino de la lista del objeto
            //esto no sobreescribe el array de la clase, en la clase seguirá siendo vino
            //porque cada objeto que se inicializa lo hace con las características, estructuras y métodos que tenga
            // la clase. Entonces estamos modificando la lista drinks_nombres de ESTE OBJETO

            super.drinks_nombres[1]="zumo"
        }

    //constructor vacío
    constructor():this("",0,0,"")

    //menú infantil siempre cuesta 12
    override fun importe_menu(): Float {
        return 12.0F
    }

    override fun mostrar_menu() {
        super.mostrar_menu()
    }


    //No hace falta el init porque al ser una clase hija, sus valores ya pasan por ese init

}