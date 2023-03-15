package CARTA2

class Carta_francesa : Carta_generica {

    init {
        super.palos_lista= mutableListOf("picas", "rombos", "diamantes", "corazones")
        super.numeros_lista.add(11)
        super.numeros_lista.add(12)
        super.numeros_lista.add(13)
    }

    protected var figuras= mapOf<Int, String>(1 to "as", 11 to "jack", 12 to "reina", 13 to "rey")

    constructor(palo: String, num:Int):super(palo, num){
        super.palos_lista= mutableListOf("picas", "rombos", "diamantes", "corazones")
        super.numeros_lista.add(11)
        super.numeros_lista.add(12)
        super.numeros_lista.add(13)
    }


    override fun mostrar_carta() {
        if (this.num_carta in figuras){
            println("La carta es el ${figuras.getValue(num_carta)} de $palo_carta\n")
        }
        else {
            super.mostrar_carta()
        }
    }

}