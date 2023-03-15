package RELOJERIA

class Alarma_composicion(r:Reloj){
    //En este caso, en lugar de heredar de reloj
    //la clase alarma va a tener como atributo, una característica que sea un objeto reloj
    //la cuál incluirá sus características inherentes. A esto se le llama composición.
    //En este caso realmente, estamos hablando de agregación, que es
    //que el objeto sigue existiendo después de borrar el objeto actual al que pertenece.
    //Si se borrase al borrar la clase, sería composición

    var reloj_compuesto=r

    //Además de recibir reloj objeto como atributo, le asigno nuevas variables:

    var hora_alarma_compuesta=0
    var minuto_alarma_compuesta=0

/*
    open fun set_alarma(h: Int, m: Int){
        hora_alarma_compuesta=h
        minuto_alarma_compuesta=m

    }

    //open fun
    */
}