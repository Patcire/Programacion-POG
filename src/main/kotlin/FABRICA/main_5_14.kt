package FABRICA



fun main(args: Array<String>) {

    var pedido_ej1=Pedido()

    //en este caso no hay que llamar ni crear ninguna función de pedir pedido
    //porque en el init de pedido usábamos 3 veces la función pedir producto
    //entonces al incializar el objeto se activa ese código y me pide 3 veces
    //las características de cada uno de los productos que conforman pedido

    pedido_ej1.mostrar_pedido()


}