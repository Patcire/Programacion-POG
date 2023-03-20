package ALMACEN.mains_args

import ALMACEN.Agua_mineral
import ALMACEN.Bebida_azucarada
import java.util.Objects

fun main(args: Array<String>) {

    //para probar lo de args para que pueda recibir o datos de mineral o de azucarada:
    //(comprobamos constructores completos)

    //args azycarada:  Bebida_azucarada 4.0 4.0 beyonce 12 20 true
    //args mineral: Agua_mineral 2.0 1.5 dualipa 20 sierra

    println("Comprobando tipo de bebida...\n")
    var tipo_obj=args[0]
    var opcion=0

    if (tipo_obj=="Bebida_azucarada"){
        opcion=1
    }
    else{
        opcion=2 //que en este caso es agua_mineral
    }

    when (opcion){
        1-> {
            var litros=args[1].toDouble()
            var precio=args[2].toDouble()
            var marca=args[3]
            var id=args[4].toInt()
            var porcentaje=args[5].toInt()
            var promocion=args[6].toBoolean()
            var asucar=Bebida_azucarada(litros, precio, marca, id, porcentaje, promocion)
            println(asucar.toString())
        }

        2->{
            var litros=args[1].toDouble()
            var precio=args[2].toDouble()
            var marca=args[3]
            var id=args[4].toInt()
            var manantial=args[5]
            var minerali=Agua_mineral(litros, precio, marca, id, manantial)
            println(minerali.toString())
        }
    }


}