package COMPRA

open class Producto3(nombre:String, precio:Double) {

    var nombre_prod="defecto"
        get(){
            return field
        }

        set(value) {
            if (value.length<4 || value.length>30){
                println("Error. Nombre entre 4-30 caracteres.")
            }
            field = value
        }
    var precio_prod=0.0
        get(){
            return field
        }

        set(value) {
            if (value<0){
                println("Error. No debe ser negativo.")
            }
            field = value
        }


    init {
        nombre_prod=nombre
        precio_prod=precio
    }


    open fun calcular_precio(cantidad:Int):Double{
        return precio_prod*cantidad
    }


}