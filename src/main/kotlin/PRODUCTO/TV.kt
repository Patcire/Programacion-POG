package PRODUCTO
//ESTA CLASE LA VOY A HACER CON CONSTRUCTOR PRIMARIO
class TV(regular_price:Double, manufacturer:String, size:Int)
    :Electronics(regular_price, manufacturer) {

    var size_product=1

    override fun compute_Sale_Price(): Double {
        return regular_price*0.8
    }

    override fun toString(): String {
        return "TV(regular price=${regular_price}, iva: $iva, manufacturer=${manufacturer},size_product=$size_product)"
    }

    init {
        size_product=size
    }

    override fun compute_Special_Customer_Price(): Double {
        return regular_price-100
    }


}