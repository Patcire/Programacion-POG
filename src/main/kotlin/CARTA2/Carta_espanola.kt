package CARTA2

class Carta_espanola: Carta_generica {

    protected var figuras= mapOf<Int, String>(10 to "sota", 11 to "caballo", 12 to "rey")


    //aunque le de otros nombres a las características, después voy a tener que utilizar los nombres OG
    //en sobreescribir y toodo eso. Ej: ver el mostrar_carta
    //En vd podría darle el mismo nombre (en vez de palo_esp, palo_carta como en la clas OG)


    constructor(palo_esp: String, num_esp:Int):super(palo_esp, num_esp){
        super.palos_lista= mutableListOf("oro", "bastos", "espadas", "copas")
        super.numeros_lista.add(11)
        super.numeros_lista.add(12)
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