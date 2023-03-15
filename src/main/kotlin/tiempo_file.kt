fun main(args: Array<String>) {

        fun imprimir() {
                println(
                        "Qué desea hacer?:\n" +
                                "1-Introducir, horas, minutos y segundos\n" +
                                "2-Introducir horas y minutos\n" +
                                "3.Introducir solo las horas\n" +
                                "4-Salir\n"
                )

        }


        var horas_usuario= 0
        var min_usuario= 0
        var seg_usuario= 0


        var tiempo_usuario=Tiempo(0,0,0)

        imprimir()
        var desea = readln().toInt()
        while (desea != 4) {
                when (desea) {
                        1 -> {
                                println("Introduzca las horas\n")
                                horas_usuario= readln().toInt()
                                println("Y los minutos\n")
                                min_usuario= readln().toInt()
                                println("Por último los segundos\n")
                                seg_usuario= readln().toInt()
                                tiempo_usuario=Tiempo(horas_usuario, min_usuario, seg_usuario)

                                println()
                                println(tiempo_usuario.toString())
                        }//fin op1
                        2 -> {
                                println("Introduzca las horas\n")
                                horas_usuario= readln().toInt()
                                println("Y los minutos\n")
                                min_usuario= readln().toInt()
                                tiempo_usuario=Tiempo(horas_usuario, min_usuario)
                                println()
                                println(tiempo_usuario.toString())

                        }//fin op2
                        3 -> {
                                println("Introduzca las horas\n")
                                horas_usuario= readln().toInt()
                                tiempo_usuario=Tiempo(horas_usuario)
                                println()
                                println(tiempo_usuario.toString())
                        }
                }//fin when
                imprimir()
                desea = readln().toInt()
        }//fin del bucle

        println("Gracias por usar nuestra app")
}
