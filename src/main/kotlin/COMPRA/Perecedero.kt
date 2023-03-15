package COMPRA

class Perecedero:Producto3 {

    var tipo_prod="defecto"

        get(){
            return field
        }

        set(value) {
            if (value.length<4 || value.length>30){
                println("Error. Nombre entre 4-30 caracteres.")
            }
            field = value
        }

    //constructor completo
    constructor(nombre:String, precio:Double, tipo:String):super(nombre, precio){
       tipo_prod=tipo
    }

}