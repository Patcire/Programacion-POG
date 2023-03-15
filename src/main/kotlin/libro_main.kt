fun main(args: Array<String>) {

    //PRIMERO CREO LA LISTA BIBLIOTECA, POR DEFECTO LE PONGO 20 POR SI NO ME PONEN NINGUNO
    var biblioteca= Libro_lista(20)



    fun imprimir_menu(){
        println("Que función desea utilizar\n?"+
                "1-Establecer tamaño de la biblioteca\n"+
                "2-Añadir libro\n"+
                "3-Borrar un libro por su título\n"+
                "4-Borrar todos los lirbos de unx autorx\n"+
                "5-Modificar algún dato\n"+
                "6-Imprimir biblioteca\n"+
                "7-Salir\n"+
                ""+
                "Introduzca el nº de su preferencia\n")
    }

    imprimir_menu()

    var desea= readln().toInt()
    //fin when
    while (desea!=7) {
        when (desea) {

            1 -> {
                println("Introduzca el tamaño de su biblioteca:\n")
                //esta variable solo existe aquí
                var tamano = readln().toInt()
                biblioteca.maxLibros = tamano

            }//fin op1

            2 -> {
                println("Introduzca el título de la obra:\n")
                var titulo_obra = readln()
                println("Y el nombre del autor/a\n")
                var nombre_aut = readln()
                println("El nº de páginas:\n")
                var num_pag = readln().toInt()
                println("¿Y qué nota le da usted?\n")
                var nota_libro = readln().toInt()
                biblioteca.añadir(Libro(titulo_obra, nombre_aut, num_pag, nota_libro))
                println()
                println("Su libro ha sido almacenado\n")
            }//fin op2

            3 -> {
                println("Introduzca el título de la obra a eliminar\n")
                var nombre_para_borrar = readln()
                biblioteca.borrar_x_titulo(nombre_para_borrar)

            }//fin op3

            4 -> {
                println("Introduzca el nombre de la autorx\n")
                var nombre_aut = readln()
                biblioteca.borrar_x_autor(nombre_aut)

            }//fin op4

            5 -> {
                println("Indique el título del libro a modificar")
                var a_mod = readln()
                println("Qué dato desea modificar (introduce el nº)?\n")
                println(
                            "a-Título\n" +
                            "b-Autor\n" +
                            "c-Nº páginas\n" +
                            "d-Nota" +
                            "e-Salir"
                )
                var dato = readln()
                while (dato != "e"){
                    when (dato) {
                        "a" -> {

                            println("Introduzca el nuevo título\n")
                            var nuevo = readln()
                            biblioteca.mod_titulo(a_mod, nuevo)


                        }// fin 1 when2

                        "b" -> {

                            println("Introduzca el nuevo autor\n")
                            var nuevo = readln()
                            biblioteca.mod_autor(a_mod, nuevo)

                        }//fin op2 when2


                        "c" -> {

                            println("Introduzca el nuevo num de páginas\n")
                            var nuevo = readln().toInt()
                            biblioteca.mod_pag(a_mod, nuevo)

                        }

                        "d" -> {

                            println("Introduzca la nueva nota\n")
                            var nuevo = readln().toInt()
                            biblioteca.mod_nota(a_mod, nuevo)

                        }

                    }//fin when2

                    println("Qué dato desea modificar (introduce el nº)?\n")
                    println("a-Título\n" +
                            "b-Autor\n" +
                            "c-Nº páginas\n" +
                            "d-Nota\n" +
                            "e-Salir\n")
                    dato= readln()
                }//FIN WHILE2

            }//fin op5

            6 -> {
                biblioteca.imprimir_biblio()
            }


        }//fin when

        imprimir_menu()
        desea = readln ().toInt()
    }//fin while
    println("Gracias por usar nuestro programa.")

}//fin prog

