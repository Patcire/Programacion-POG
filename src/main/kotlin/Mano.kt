class Mano(numero_cartas:Int, lista_cartas: MutableList<Carta>){

    var num_cartas=3
        get(){
            return field
        }

        set(value){
            if (num_cartas<0 || num_cartas>3){
                println("Error, la mano debe tener entre 0 y 3 cartas\n")
            }
            else{
                field=value
            }
        }

    var lista_cartas_en_mano= mutableListOf<Carta>()
        get(){
            return field
        }
        set(value){
            if (lista_cartas_en_mano.size >3){
                println("Error, la mano solo puede tener valores entre 0 y 3")
            }
            else {
                field = value
            }
        }

    //INIT
    init{

        num_cartas=numero_cartas

        if (lista_cartas.size>3){
            println("Error, solo puede tener 3 cartas en su mano\n")

        }
        else{
            lista_cartas_en_mano=lista_cartas
        }


    }

    //BARAJA
    //val palos= mutableListOf<String>("")
    //var baraja= mutableListOf<Carta>()
    //for (i in 0..13){

    //}

    //FUNCIONES
    fun obtener_tamano():Int{
        println("El tamaño de la mano es:\n")
        return num_cartas

    }


    fun mostrar_carta(pos:Int): Carta {

        return lista_cartas_en_mano[pos]

    }

    fun actualizar(pos:Int){
        println("Indique el nuevo nº de la carta a modificar\n")
        var nuevo_num= readln().toInt()
        (lista_cartas_en_mano[pos]).num= nuevo_num
        println("Indique la inicial del nuevo palo\n")
        var nuevo_palo= readln()
        (lista_cartas_en_mano[pos]).palo= nuevo_palo

    }


    //fun pedir_mano()  ?????

    //fun pedir_carta(): Carta{

    //}


    fun mostrar_mano(): String{
        return "Mano(lista_cartas_en_mano=$lista_cartas_en_mano)"
    }





    fun mano_ganadora(otra: Mano){
        (this.lista_cartas_en_mano[0]).comparar(otra.lista_cartas_en_mano[0])


    }







}























