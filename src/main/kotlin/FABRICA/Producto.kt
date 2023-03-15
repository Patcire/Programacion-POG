package FABRICA

import kotlin.random.Random

class Producto (nombre: String, precio: Double) {


    private var nombre_prod=""

    private var num_serie=0
        get(){
            return field
        }

        set(value){
            if(value<=0){
            println("Error, el nº de serie no puede ser negativo")
            }

            else{
                field=value
            }
        }


    private var precio_prod=0.0

        get(){
            return field
        }

        set(value){
            if(value<0){
                println("Error, el precio no puede ser negativo")
            }

            else{
                field=value
            }
        }


    init{
        nombre_prod=nombre
        precio_prod=precio
        num_serie=generar()
    }



    //para generar los num aleatorios

    var lista_num= mutableListOf<Int>()


    private fun generar(): Int {

        //en este caso no me dice que no se pueda repetir
        return (1..100).random()

    }//fin generar

    //constructor x dedecto
    constructor(): this ("defecto",0.00){
    }




    fun pedir_nombre(){
        println("Introduzca el nuevo nombre del artículo\n")
        var nombre_pedido= readln()
        while (nombre_pedido.length>40){
            println("Nombre demasiado largo\n")
            println("Introduzca el nuevo nombre del artículo\n")
            nombre_pedido= readln()
        }
        this.nombre_prod=nombre_pedido

    }//fin pedir


    // Otra forma para pedir, llamando al objeto dentro de si mismo (recursividad). MUY GUAY!

    fun pedir_nombre_forma2() {
        println("Introduzca el nuevo nombre del artículo\n")
        var nombre_pedido = readln()
        if (nombre_pedido.length > 40) {
            println("Nombre demasiado largo\n")
            pedir_nombre_forma2()
        }
        this.nombre_prod = nombre_pedido

    }

    fun pedir_precio(){

        println("Introduzca el nuevo precio del artículo\n")
        var precio_pedido= readln().toDouble()
            while (precio_pedido<0){
                println("No puede ser un precio negativo\n")
                println("Introduzca el nuevo precio del artículo\n")
                precio_pedido= readln().toDouble()
            }
            this.precio_prod=precio_pedido
    }




    fun resumen() {

        println("Nombre: <$nombre_prod>\n"+
            "Nº serie: <$num_serie>\n"+
            "Precio: <$precio_prod>\n")

    }

    //normalmente se le llama equals
    //intellij te puede generar un metodo equal donde también comprueba si el la misma posición de memoria
    //con triple igual ===
    //el método de intellij te compara objetos de cualquier tipo
    //Pero en el mío lo hago a mano y normal:

    fun iguales(otro:Producto): Boolean{

        if (this.nombre_prod == otro.nombre_prod && this.num_serie == otro.num_serie){
            return (true)
        }
            return false
        }


    //para seguir manteniendo el precio privado y poder utilizarlo en la función total de pedido hago esta función
    fun obtener_precio(): Double {
        return this.precio_prod
    }

}