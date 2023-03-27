package VEHICULOS

import java.io.File

fun main(args: Array<String>) {

    //actividad: crear un fichero que escriba los datos de vehículo del proyecto de vehículos para ello



    var datos_vehiculos = File("datos_vehiculos.txt")

    var coche_rojo= Coche("1234zzz", 5, 4)
    var camion= Camion("0000www",2,2)
    var bus=Bus("1111zzz", 2,50)
    var furgoneta=Furgoneta("1222zzz", 2, 3)

    datos_vehiculos.writeText(coche_rojo.toString()+camion.toString()+bus.toString()+furgoneta.toString())

}