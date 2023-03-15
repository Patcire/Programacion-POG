package VEHICULOS

fun main(args: Array<String>) {

    var pedido_lista= mutableListOf<Vehiculo>()

    fun imprimir_menu(){
        println("Hola bienvenido. Seleccione con el nº correspondiente la opción deseada\n" +
                "1-Añadir coche\n" +
                "2-Añadir bus\n" +
                "3-Añadir furgoneta\n" +
                "4-Añadir camión\n" +
                "5-Salir")
    }

    fun importe_total(): Double {
        var total=0.0
        for (i in pedido_lista){
            total+=i.calcular_alquiler()
        }
        return total
    }

    fun importe_individual(pos:Int){
        (pedido_lista[pos]).recibo()

    }



    var opcion= 0


    imprimir_menu()
    opcion= readln().toInt()
    while(true) {
        when (opcion) {
            1 -> {
                println("Introduzca la matrícula\n")
                var matricula = readln()
                print("Los días de alquiler\n")
                var dias = readln().toInt()
                println("Y las plazas\n")
                var plazas = readln().toInt()
                pedido_lista.add(Coche(matricula, dias, plazas))
            }

            2 -> {
                println("Introduzca la matrícula\n")
                var matricula = readln()
                print("Los días de alquiler\n")
                var dias = readln().toInt()
                println("Y las plazas\n")
                var plazas = readln().toInt()

            pedido_lista.add(Bus(matricula, dias, plazas))
            }
            3 -> {
                println("Introduzca la matrícula\n")
                var matricula = readln()
                print("Los días de alquiler\n")
                var dias = readln().toInt()
                println("Y la tara:\n")
                var tara = readln().toInt()
                pedido_lista.add(Furgoneta(matricula, dias, tara))
            }

            4->{
                println("Introduzca la matrícula\n")
                var matricula = readln()
                print("Los días de alquiler\n")
                var dias = readln().toInt()
                println("Y la tara:\n")
                var tara = readln().toInt()
                pedido_lista.add(Camion(matricula, dias, tara))
            }
        }//fin when


        if (opcion==5){
            break
        }
        imprimir_menu()
        opcion= readln().toInt()

    }//fin while

    println( importe_total())
    println("Gracias por su visita")

}