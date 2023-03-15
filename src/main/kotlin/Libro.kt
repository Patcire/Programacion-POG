class Libro (Titulo: String, Autor: String, Numero_paginas: Int, Calificacion: Int) {//fin clase

    var titulo=Titulo

        get(){
            return field
        }

        set(value) {
                field = value
        }
    var autor=Autor

        get(){
            return field
        }

        set(value) {
                field = value
        }

    var num_pag= 0

        //si lo pusiera = al parametro , no pasaría por el init
        //ej: num_pag = Numero_paginas no pasa el init

        get(){
            return field
        }

        set (value){
            if (value<1){
                println("Error, no puede tener menos de 1 página\n")
            }
            field=value
        }

    var nota= 0

        get(){
            return field
        }

        set(value) {
            if (value<0  || value>10) {
                println("Error. Introduzca la calificación debe estar comprendida entre 0 y 10\n")
            } else {
                field = value
            }
        }

    init {
        titulo=Titulo
        autor=Autor
        num_pag= Numero_paginas
        nota= Calificacion
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', num_pag=$num_pag, nota=$nota)"
    }

    //kotlin me dijo que tenía que crear esto, pero no sé que es
    operator fun set(i: Int, value: Any) {

    }


}
