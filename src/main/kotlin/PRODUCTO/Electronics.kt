package PRODUCTO

abstract class Electronics:Product {
    //al ser esta abstracta también, aunque herede de product, no hace falta que implemente el método de product
    var manufacturer=""


    constructor(regular_price:Double, manufacturer:String):super(regular_price){
        this.manufacturer=manufacturer
    }


    //no implementa el código de compute_sale_price, por tanto es abstracta.
}