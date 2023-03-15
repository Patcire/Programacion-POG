package PRODUCTO

abstract class Product(regularInitialPrice: Double):Relation_Interface {
                                                //va a recibir los métodos utilizados de esa interfaz
        var regular_price=0.0

        //al poner abstracta ya no hace falta que la siguientes clases abstractas que heredan deban implementarla
        abstract fun compute_Sale_Price():Double //precio CON DESCUENTO

        //1.11

        var iva=21
            get(){
                return field
            }

            set(value) {
                if (value !in iva_lista){
                    println("Error. el iva debe ser 0,4,10 o 21%")
                }
                else{
                    field = value
                }

            }

        var numero_serie=0
        init {
            regular_price=regularInitialPrice
            this.iva=iva
            contador+=1
            numero_serie= contador
        }

        //función pedidda en el 1.9
        abstract fun compute_Special_Customer_Price():Double


    //1.12 companion object
        companion object {
        //con private jago que desde fuera no me puedan cambiar estos valores
        private var contador=0
        private val iva_lista=arrayListOf<Int>(0, 4, 10, 21)

        //como pertenece al CO mejor poner esta función dentro del CO
        fun ver_contador():Int{
            return contador
        }


    }

    //override la interfaz

    override fun isLess(a: Any): Boolean {
        a as Product
        //de estar forma, return y la condición
        //ya con eso va a devolver true o false

        return (a.regular_price > this.regular_price)

    }

    //si lo hacemos normal con el if y el else, está bien pero
    //marca amarillo porque lo marca como redundante pero está bien

    override fun isEqual(a: Any): Boolean {
        a as Product
        if ( a.regular_price < this.regular_price)
            return true
        else
            return false


    }

    override fun isGreater(a: Any): Boolean {
        a as Product
        if (a.regular_price < this.regular_price)
            return true
        else
            return false
    }



}//fin clase

