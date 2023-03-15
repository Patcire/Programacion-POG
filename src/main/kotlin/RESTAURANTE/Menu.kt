package RESTAURANTE

open class Menu (iva: Float, descuento:Float, principal: String, bebida: Int, postre: Int){
            //constructor principal


    var princi= mapOf<String,Int>("entrecot" to 15, "carrillada" to 10, "dorada" to 20, "otros" to 13 )

    var drinks=mapOf<Int,Double>(1 to 1.0, 2 to 1.5, 3 to 2.0) //en orden: refresco, vinos, otros
    var drinks_nombres= arrayOf("refresco", "vino", "otro")
    //var drinks=mapOf<Int,Array<Float, String>>(1 to (1.0, "Refresco"), 2 to 1.5, 3 to 2.0) //en orden: refresco, vinos, otros
    var postresillo=mapOf<Int,Int>(1 to 2, 2 to 3, 3 to 4) //EN Orden, fruta, helado, otros
    var postresillo_nombres= arrayOf("fruta", "helado", "otros")

    var iva_impuesto=0.21F

        get(){
            return field
        }

        set(value) {
            if (value !=0.21F){
                println("Error. El iva es siempre del 21%\n")
            }
            else {
                field = value
            }
        }

    var desc=0.15F

        get(){
            return field
        }

        set(value) {
            if (value >=0.80F){
                println("Error. El descuento no puede ser superior al 80%\n")
            }
            else {
                field = value
            }
        }

    var principal_cliente=""

        get(){
            return field
        }

        set(value) {
            if (value.lowercase() !in princi.keys) {
                println("Error. No tenemos ese plato\n")
            }
            else {
                field = value
            }
        }


    var bebida_cliente=0
        get(){
            return field
        }
        set(value) {
            if (value !in drinks.keys) {
                println("Error. No tenemos esa bebida\n")
            }
            else {
                field = value
            }
        }

    var postre_cliente=0
        get(){
            return field
        }
        set(value) {
            if (value !in postresillo.keys) {
                println("Error. No tenemos ese postre\n")
            }
            else {
                field = value
            }
        }


    //constructor vacío
    constructor(): this(0.0F,0.0F,"carrillada",1,1)


    // Constructor con todos los parámetros necesarios para inicializar atributos
    // (excepto IVA y descuento, que no se incluyen en el constructor por ser comunes a todos los menús).

    constructor(principal: String, bebida: Int, postre:Int):
            this(0.21F, 0.15F, principal, bebida, postre)


    init{
        iva_impuesto=0.21F
        desc=descuento
        principal_cliente=principal
        bebida_cliente=bebida
        postre_cliente=postre

    }

    open fun importe_menu():Float{

        var suma_total= princi.getValue(principal_cliente)+drinks.getValue(bebida_cliente)+postresillo.getValue(postre_cliente)
        var descuento=suma_total*desc
        var importe_final=(suma_total-descuento).toFloat()
        return importe_final
    }


    open fun mostrar_menu(){

        println("Su menú ha sido:\n"+
                "Plato principal: $principal_cliente\n"+
                "Bebida: ${drinks_nombres[bebida_cliente-1]}\n"+
                "Postre: ${postresillo_nombres[postre_cliente-1]}\n"+
                "Con un importe total de:\n")
        println(importe_menu())


    }



}