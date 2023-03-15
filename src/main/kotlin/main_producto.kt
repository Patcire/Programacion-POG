fun main(args: Array<String>) {
    var agua= producto_2()
    var pan= producto_2()

    agua.nombre="FontVella"
    agua.precio=2.45
    agua.codigo=34

    pan.nombre="Rústica"
    pan.precio=1.50
    pan.codigo=3

    agua.imprimir()
}