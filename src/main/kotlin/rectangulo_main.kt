fun main(args: Array<String>) {

    var rect1= rectangulo()
    var rect2= rectangulo()


    rect1.base=2
    rect1.altura=4
    rect1.nombre= "rectángulo 1"

    rect2.base=6
    rect2.altura=4
    rect1.nombre= "rectángulo 2"

    println(rect1.toString())
    println("El área del rectángulo 1 es "+rect1.area()+" y el perímetro es "+rect1.perimetro())

    println()

    println(rect1.toString())
    println("El área del rectángulo 2 es "+rect2.area()+" y el perímetro es "+rect2.perimetro())

}