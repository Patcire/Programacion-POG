package PRODUCTO

fun main(args: Array<String>) {

    var products_storage= mutableListOf<Product>()

    products_storage.add(TV(1000.0, "Sony", 50))
    products_storage.add(TV(1200.0,"Samsung", 70))
    products_storage.add(MP3Player(50.0,"Samsung", "verde"))
    products_storage.add(Book(20.0,"Penguin",1995))
    //le he puesto el iva mal para ver que me salta el error. Al imprimirse lo pone a 0,
    // que era el que tenía por defecto la clase PRODUCTO
    products_storage.add(Book(10.0,"anagrama",1987))
    products_storage.add(Camera(280.0,"sony"))
    products_storage.add(Camera(250.0,"adobe"))

    var total_price_with_discount=0.0
    var total_price=0.0

    for (i in products_storage){
        println(i.toString())
        println("Para clientes especiales el precio sería ${i.compute_Special_Customer_Price()}")
        println()
        total_price_with_discount+=i.compute_Sale_Price()
        total_price+=i.regular_price
    }

    println("Usted no es cliente especial, sin descuento es $total_price euros, aun asísi le aplicamos las rebajas de temporada, se quedaría en " +
            "$total_price_with_discount euros")

    //Para ver el contador del ñultimo objeto llamo a su función

    println("Estamos viendo el contador: ${Product.ver_contador()}")

    //si quisiera impirimir el nº serie de cada objeto en el toString llamo a su nº de serie que tiene
    //simplemente por ser objeto

}