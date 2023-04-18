package PRODUCTO

import java.io.File

fun main(args: Array<String>) {

/*
Crea una aplicación de gestión de productos en una lista (TV,Book,Mp3..) añadir producto, borrar producto de lista, modificar producto, mostrar todoo y salir.

Se podría hacer al salir o en cualquier momento:
-Grabar la lista en el fichero
-opción 2 graba la lista en el fichero a continuación de lo que había en el el mismo.
-Añadir opciones al iniciar cargar o en cualquier momento:
 datos de fichero a la lista sustituyendo la lista que teníamos,
-Opción 2  Añadir opciones al iniciar cargar datos de fichero a la lista ampliándola lista que teníamos

 */

    var products_storage= mutableListOf<Product>()

    /*
   products_storage.add(TV(1000.0, "Sony", 50))
   products_storage.add(TV(1200.0,"RRRRR", 70))
   products_storage.add(MP3Player(50.0,"Samsung", "verde"))
   products_storage.add(Book(10.0,"anagrama",1987))
   products_storage.add(Camera(280.0,"sony"))
   products_storage.add(Camera(250.0,"adobe"))


   File("datos_productos.txt").printWriter().use { out ->
       for (producto in products_storage) {
           out.println(producto.toString2())
       }
   }

     */

    //esta variable es los productos almacenados en el fichero


    fun pasar_productos_ficheros_a_lista(){

        var almacen_fichero=File("datos_productos.txt").bufferedReader().readLines()
        for (line in almacen_fichero){
            var producto = line.split("#")
            when (producto[0]){
                "TV"-> { //me salto la posicion 2 del producto xq se le inicializaba un parámetro extra IVA que no le paso al constructor
                    products_storage.add(TV(producto[1].toDouble(), producto[3], producto[4].toInt()))
                }
                "Camera" ->{
                    products_storage.add(Camera(producto[1].toDouble(), producto[3]))
                }
                "MP3Player"->{
                    products_storage.add(MP3Player(producto[1].toDouble(), producto[3], producto[4]))
                }
                "Book"->{
                    products_storage.add(Book(producto[1].toDouble(), producto[3], producto[4].toInt()))
                }
            }
        }
    }

    fun imprimir_almacen(){
        for (producto in products_storage){
            println(producto.toString())
        }
    }

    pasar_productos_ficheros_a_lista()
    imprimir_almacen()


}