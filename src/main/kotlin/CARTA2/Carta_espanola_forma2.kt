package CARTA2

class Carta_espanola_forma2 : Carta_generica {

    //de esta forma no tiene mucho sentido la herencia, porque tengo que volver a asignar
    // las variables para modificar los getter y los setters

    var palo_esp=""
        get(){
            return field
        }

        set(value) {

            if (value.length < 15) {
                println("Error, como máximo el palo solo puede tener 15 caracteres")
            } else {
                field = value
            }
        }

    var num_esp=0
        get(){
            return field
        }

        set(value) {

            if (value< 13) {
                println("Error, como máximo el nº solo puede ser hasta 13")
            } else {
                field = value
            }
        }


    protected var palos= arrayOf(" Oro", "Espadas", "Copas", "Bastos")
    protected var figuras= mapOf<Int, String>(10 to "Sota", 11 to "Caballo", 12 to "Rey")

    constructor(palo: String, num: Int):super(palo, num){

        palo_esp=palo
        num_esp=num




    }

}