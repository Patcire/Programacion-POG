package PRODUCTO

class Book:Product{

    var publisher_book=""
    var year_book=0

    constructor(regular_price:Double, publisher:String, year_publisher:Int):super(regular_price){
        publisher_book=publisher
        year_book=year_publisher
    }

    override fun compute_Sale_Price(): Double {
        return regular_price*0.5
    }

    override fun toString(): String {
        return("Book(regular_price:${regular_price}, iva:$iva, publisher: $publisher_book , year: $year_book)")
    }

    //toString2 es para la actividad de escritura de E/S
    override fun toString2(): String{
        return("Book#${regular_price}#$iva#$publisher_book#$year_book")
    }

    override fun compute_Special_Customer_Price(): Double {
        return regular_price-2
    }
}