package CARTA2

open class Carta_generica_funciona_inicializar (palo: String, numero: Int) {

    //La carta genérica puede tener cualquier tipo de palo, aunque le voy a poner que no pueda tener más de 15 carácteres
    //y que el nº no sea menor que 1


    protected var palos_lista= mutableListOf<String>("palo1", "palo2", "palo3", "palo4")
    protected var numeros_lista= mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10) //es más interesante un rango

     var palo_carta=""
        get(){
            return field
        }

        set(value) {

            if (value.lowercase() !in palos_lista) {
                println("Error, esta baraja no tiene ese palo\n")
            } else {
                field = value
            }
        }


     var num_carta=1

        get(){
            return field
        }

        set(value) {
            if (value !in numeros_lista){
                println("Error. Ese nº de carta no existe en esta baraja\n")
            }
            else{
                field = value
            }

        }


    init{
        palo_carta=palo
        num_carta=numero
    }



    //constructor por defecto
    constructor():this("palo1",5)


    override fun toString(): String {
        return "Carta_generica(palo_carta='$palo_carta', num_carta=$num_carta)"
    }

    open fun mostrar_carta(){
        println("La carta es el $num_carta de $palo_carta\n")
    }





}