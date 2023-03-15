package FABRICA

class Pedido() {
        //constructor por defecto

    //a mi forma, con lista en vez de un array
    //var almacen_prod= mutableListOf<Producto>()

        var almacen_prod= Array (3) {Producto()}


        get(){
            return field
        }

        set(value) {
            if (almacen_prod.size > 3 || almacen_prod.size<3) {
               println("Error, Solo puede incluir pedidos con 3 productos")
            }
            else{
                field= value
            }
        }

        //como tengo que inicializar r productos según el enunciado pidiéndolo

        init{
            //en este caso el i es el indice del producto
            for (i in (1..almacen_prod.size))
            pedir_producto_forma_ismael(i)
        }



    //esto era lA función pedir producto mía, funcionaba para LISTA
    /*
    fun pedir_producto(posicion_usuario: Int) {
        if (posicion_usuario > 0 && posicion_usuario < 3) {
            var posicion = posicion_usuario - 1

            println("Introduzca el nombre\n")
            var nombrep = readln()
            println("Introduzca el precio\n")

            var prexio = readln().toDouble()

            var prod1 = Producto()

            var prod = Producto(nombrep, prexio)
            almacen_prod.add(posicion, prod)

        } else {
            println("Error, la posición debe estar comprendida entre 1 y 3 ")
        }
    }

    */

    fun pedir_producto_forma_ismael(posicion_usuario: Int){
        if (posicion_usuario > 0 && posicion_usuario <= 3) {
            //el -1 xq le pido la posición empezando en 1 y no en 0
            var posicion = posicion_usuario - 1

            almacen_prod[posicion].pedir_nombre()
            almacen_prod[posicion].pedir_precio()


        }

        else{
            println("Error, la posición debe estar comprendida entre 1 y 3 ")
        }

    }

    fun total(): Double{
        var total=0.0
        for (i in almacen_prod){
            total+= i.obtener_precio()
        }
        return total
    }

    fun mostrar_pedido(){
        println("Los artículos del pedido son:\n")
        for (i in almacen_prod){
            i.resumen()
        }
        println("TOTAL: ${total()}")
    }


}