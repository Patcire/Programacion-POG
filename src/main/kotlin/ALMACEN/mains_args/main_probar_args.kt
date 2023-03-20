package ALMACEN.mains_args

import ALMACEN.Bebida_azucarada

fun main(args: Array<String>) {

    //para probar lo de args
    //COMPROBAMOS CONSTRUCTOR COMPLETO:

    // litros precio marca identificador porcentaje_azucar promocion

    var litros=args[0].toDouble()
    var precio=args[1].toDouble()
    var marca=args[2]
    var id=args[3].toInt()
    var porcentaje=args[4].toInt()
    var promocion=args[5].toBoolean()

    var asuuucar= Bebida_azucarada(litros, precio, marca, id, porcentaje, promocion )
    println(asuuucar.toString())

}