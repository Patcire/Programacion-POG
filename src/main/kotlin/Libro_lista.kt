
class Libro_lista(maxTamano: Int){

    //esto para establecer por el tamaño
    var maxLibros=maxTamano
    //el tamaño se lo vamos a asignar desde el main a través del constructor principal


    val almacen_libros= mutableListOf<Libro>()
    //el tamaño lo controlo desde fuera con el añadir

    //después de los dos tipos siempre se refiere al tipo de elemento que va a recibir
    fun añadir(otroLibro:Libro) {
        if (almacen_libros.size < maxLibros) {
            almacen_libros.add(otroLibro)
        }
        else{
            println("Tamaño máximo alcanzado\n")
        }
    }

    fun imprimir_biblio(){
        for (i in almacen_libros){
            println(i.toString())
        }
    }

    fun borrar_x_titulo(titulo_a_Borrar: String){
        for (i in almacen_libros){
            if (i.titulo.equals(titulo_a_Borrar)) {
                almacen_libros.remove(i)
                break
            }
        }

    }

    //ARREGLAR, no funciona porque solo borra el primer elemento del autor
    fun borrar_x_autor(autor_a_Borrar: String){
        for (i in almacen_libros) {
            if (i.autor == autor_a_Borrar) {
                almacen_libros.remove(i)
                continue

            }
        }
    }

    fun mod_titulo(a_mod: String, nuevo: String){
        for (i in almacen_libros) {
            if (i.titulo.equals(a_mod)) {
                //i[0] = nuevo
                //está bien lo de la lista, pero mejor con la propia característica del objeto
                i.titulo= nuevo
                break
            }
        }
    }


    fun mod_autor(a_mod: String, nuevo: String){
        for (i in almacen_libros) {
            if (i.titulo.equals(a_mod)) {
                //i[1] = nuevo
                i.autor= nuevo
                break
            }
        }
    }

    fun mod_pag(a_mod: String, nuevo: Int){
        for (i in almacen_libros) {
            if (i.titulo.equals(a_mod)) {
                //i[2] = nuevo
                i.num_pag= nuevo
                break
            }
        }
    }

    fun mod_nota(a_mod: String, nuevo: Int){
        for (i in almacen_libros) {
            if (i.titulo.equals(a_mod)) {
                //i[3] = nuevo
                i.nota= nuevo
                break
            }
        }
    }

}