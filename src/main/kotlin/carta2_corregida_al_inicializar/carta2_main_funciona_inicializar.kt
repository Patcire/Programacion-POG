package CARTA2

fun main(args: Array<String>) {

    var cartagen= Carta_generica_funciona_inicializar()
    cartagen.mostrar_carta()

    //Si la incializo con los valores propios del tipo de carta me da error:
    //Ya no me da error, debido a los cambios en los constructores de las clases hijas


   var cartaesp= Carta_espanola_funciona_inicializar("bastos", 10)
   cartaesp.mostrar_carta()

   var cartafr= Carta_francesa_funciona_inicializar("DIAMANTES", 12)
   cartafr.mostrar_carta()



    //si le doy unos valores por defecto, siendo estos valores de carta genérica,
    // y luego los modifico por valores propios de esa carta no hay error:

    /*
    var cartaesp= Carta_espanola("oro", 8)
    //cartaesp.palo_carta="bastos"
    //cartaesp.num_carta=11
    cartaesp.mostrar_carta()


    var cartafr= Carta_francesa ("palo2", 4)
    cartafr.palo_carta="DIAMANTES"
    cartafr.num_carta=13
    cartafr.mostrar_carta()

    //Conclusión: el constructor de las clases hijas y los setters de la clase padre
    //a los que llama están bien, pero se inicializan mal porque al incializarse el obj hijo
     // esos valores no están en las listas de la clase padre que cree


     */
}