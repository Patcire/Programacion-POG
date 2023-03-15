class Mano_2 {
    //en este caso el principal va a estar vacío, pero eso no es muy común
    var tamano=3
    var varias_cartas= mutableListOf<Carta>()
    init {
        for (i in (0..tamano-1)){

        }
    }


    fun obtener_tamano():Int{
        println("El tamaño de la mano es:\n")
        return tamano

    }
}