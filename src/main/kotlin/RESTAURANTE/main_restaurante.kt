package RESTAURANTE

fun main(args: Array<String>) {


    //descuento al 0.15F ya venía incluido en el constructor secundario
    var menu1 = Menu("carrillada", 1,1 )
    var menu_inf = Menu_Infantil("carrillada", 1, 1, "muñeca")
    var importe_mesa = 0.0F
    var contador_normales = 0
    var contador_inf = 0

    fun desea_usted() {
        println(
            "Qué desea, escriba el nº: " +
                    "1- Menú normal " +
                    "2- Menú Infantil" +
                    "3-Pagar y salir\n"
        )
    }


    println("Bienvenido a Mesón Mostaza\n")

    desea_usted()
    var desea = readln().toInt()
    while (true) {
        when (desea) {
            1 -> {
                println("Qué plato principal desea tomar?\n")
                menu1.principal_cliente = readln()
                println("y qué bebida?\n")
                menu1.bebida_cliente = readln().toInt()
                println("Por último, qué postre quiere?\n")
                menu1.postre_cliente = readln().toInt()
                importe_mesa += menu1.importe_menu()
                contador_normales += 1
                menu1.mostrar_menu()

            }//fin op1

            2 -> {
                println("Qué plato principal desea tomar?\n")
                menu_inf.principal_cliente = readln()
                println("y qué bebida?\n")
                menu_inf.bebida_cliente = readln().toInt()
                println("Por último, qué postre quiere?\n")
                menu_inf.postre_cliente = readln().toInt()
                importe_mesa += menu_inf.importe_menu()
                contador_inf += 1
                menu_inf.mostrar_menu()
            }//fin op2

        }//fin when
        if (importe_mesa > 140.0F) {
            println("Límite de importe alcanzado. Debe pagar $importe_mesa euros")
            break
        }//fin if

        desea_usted()
        desea = readln().toInt()
        if (desea==3){
            break
        }
        if (contador_normales+contador_inf==12){
            break
        }

    }//fin del while




    println(
        "Resumen:" +
                "nº menús normales= $contador_normales\n" +
                "nº menús infantiles= $contador_inf\n" +
                "Importe total de la mesa: $importe_mesa euros\n" +
                "Importe medio por comensal= ${importe_mesa / (contador_normales + contador_inf)} euros\n")


}