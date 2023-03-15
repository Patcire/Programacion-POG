package CARTA2

class Carta_francesa_funciona_inicializar : Carta_generica_funciona_inicializar {

    init {
        super.palos_lista= mutableListOf("picas", "rombos", "diamantes", "corazones")
        super.numeros_lista.add(11)
        super.numeros_lista.add(12)
        super.numeros_lista.add(13)
    }

    protected var figuras= mapOf<Int, String>(1 to "as", 11 to "jack", 12 to "reina", 13 to "rey")

    constructor(palo: String, num:Int):super("palo1", 5){
        super.palos_lista= mutableListOf("picas", "rombos", "diamantes", "corazones")
        super.numeros_lista.add(11)
        super.numeros_lista.add(12)
        super.numeros_lista.add(13)
        palo_carta=palo
        num_carta=num
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