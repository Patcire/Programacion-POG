package PRODUCTO.mains_probar_args

import PRODUCTO.*

fun main(args: Array<String>) {

    //Recibe una lista de productos deShopOnline  tipo Tv, mp3, libro crea la lista y calcula el total..

    var lista= mutableListOf<Product>()

    //esto es lo que voy a recibir por ARGUMENTOS(sin las comas):
    //TV 200.0 sony 5 , MP3Player 50.0 kaka verdesillo ,Book 10.0 anagrama 2023,Camera 280.0 sony

    //así puedo recorrer los args por posicion y el elemento
    for ((posicion, producto) in args.withIndex()){
        if (producto.uppercase()=="TV"){

            lista.add(TV(args[posicion+1].toDouble(), args[posicion+2],
                args[posicion+3].toInt()))
        }
        if (producto.uppercase()=="MP3PLAYER"){

            lista.add(MP3Player(args[posicion+1].toDouble(), args[posicion+2],
                args[posicion+3]))
        }

        if (producto.uppercase()=="BOOK"){
            lista.add(Book(args[posicion+1].toDouble(), args[posicion+2],
                args[posicion+3].toInt()))
        }

        if (producto.uppercase()=="CAMERA"){
            lista.add(Camera(args[posicion+1].toDouble(),args[posicion+2]))
        }

    }

    println(lista)

}