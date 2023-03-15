package CARTA2

class Carta_espanola_funciona_inicializar: Carta_generica_funciona_inicializar {

    protected var figuras= mapOf<Int, String>(10 to "sota", 11 to "caballo", 12 to "rey")


    //aunque le de otros nombres a las características, después voy a tener que utilizar los nombres OG
    //en sobreescribir y toodo eso. Ej: ver el mostrar_carta
    //En vd podría darle el mismo nombre (en vez de palo_esp, palo_carta como en la clas OG)


    constructor(palo_esp: String, num_esp:Int):super("palo1", 5){
        //el super debe recibir valores que ya existen en la clase padre para
        //que no se inicie con error
        super.palos_lista= mutableListOf("oro", "bastos", "espadas", "copas")
        super.numeros_lista.add(11)
        super.numeros_lista.add(12)
        //le pasamos el valor a la clase padre, PERO UNA VEZ QUE YA HE CA,BIADO LAS LISTAS
        //DE ESTA FORMA NO ME DA ERROR
        palo_carta=palo_esp
        num_carta=num_esp


    }


    override fun mostrar_carta() {
        if (num_carta in figuras){
            println("La carta es el ${figuras.getValue(num_carta)} de $palo_carta\n")
        }
        else {
            super.mostrar_carta()
        }
    }


}