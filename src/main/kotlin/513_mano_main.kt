fun main(args: Array<String>) {

    //var lista_mano1= mutableListOf<Carta>((Carta(12, "R")),(Carta(8, "P")),(Carta(11, "D"))
    var lista_mano1= mutableListOf<Carta>()
    lista_mano1.add(Carta(12, "R"))
    lista_mano1.add(Carta(8, "P"))
    lista_mano1.add(Carta(11, "D"))

    var mano1= Mano(3, lista_mano1)

    var lista_mano2= mutableListOf<Carta>()
    lista_mano1.add(Carta(11, "C"))
    lista_mano1.add(Carta(9, "P"))
    lista_mano1.add(Carta(11, "R"))

    var mano2= Mano(3, lista_mano1)





}