import java.util.Objects

class Carta(Numero: Int, Palo: String) {

    var num= Numero
        get(){
            return field
        }
        set(value){
            if (value>13 || value <1){
                println("Error. Número no válido")
            }
            else{
                field=value
            }

        }

    //tengo que crear algunas variables
    val mapa_palo= mapOf<String, String>("C" to "Corazones","P" to "Picas","R" to "Rombos","T" to "Trébol")

    val valores_especiales= mapOf<Int, String>(1 to "As", 11 to "Jack", 12 to "Reina", 13 to "Rey" )
    //

    var palo= Palo

        get(){
            return field
        }
        set(value){
            if (value !in mapa_palo.keys){
                println("Error. Palo no válido")
            }
            else{
                field=value
            }

        }


    init {
        palo=Palo
        num=Numero
    }

    //constructor copia
    constructor(copia: Carta): this(copia.num, copia.palo)

    fun mostrar() {

        if (num !in valores_especiales.keys) {
            println("Esta carta tiene el número $num y el palo ${mapa_palo[palo]}")
        } else {
            println("Esta carta es ${valores_especiales[num]} y su palo es ${mapa_palo[palo]}")
        }

    }


    fun comparar(Otra: Carta) {

        //el sistema para ganar estaba hecho para que el palo ganáse alfabéticamente
        // me podría haber ahorrado tanto if

        if (this.num > Otra.num) {
            println("Gana la carta con número ${this.num} ")

        }

        if (Otra.num > this.num) {
            println("Gana la carta con número ${Otra.num}")
        } else {

            if (this.palo == Otra.palo) {
                println("Las dos cartas son iguales\n")
            } else if (this.palo == "T") {
                println("Gana la carta con número ${this.num} y palo ${this.mapa_palo[this.palo]}")
            } else if (Otra.palo == "T") {
                println("Gana la carta con número ${Otra.num} y palo ${Otra.mapa_palo[Otra.palo]}")
            } else if (this.palo == "R") {
                println("Gana la carta con número ${this.num} y palo ${this.mapa_palo[this.palo]}")
            } else if (Otra.palo == "R") {
                println("Gana la carta con número ${Otra.num} y palo ${Otra.mapa_palo[Otra.palo]}")
            } else if (this.palo == "P") {
                println("Gana la carta con número ${this.num} y palo ${this.mapa_palo[this.palo]}")
            } else if (Otra.palo == "P") {
                println("Gana la carta con número ${Otra.num} y palo ${Otra.mapa_palo[Otra.palo]}")
            } else if (this.palo == "C") {
                println("Gana la carta con número ${this.num} y palo ${this.mapa_palo[this.palo]}")
            } else {
                println("Gana la carta con número ${Otra.num} y palo ${Otra.mapa_palo[Otra.palo]}")
            }
        }
    }

}