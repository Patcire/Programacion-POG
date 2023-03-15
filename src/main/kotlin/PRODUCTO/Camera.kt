package PRODUCTO

import javax.print.attribute.standard.PrinterMoreInfoManufacturer

class Camera:Electronics {

    constructor(regular_price:Double, manufacturer: String):super(regular_price, manufacturer)

    override fun compute_Sale_Price(): Double {
        return regular_price*0.7
    }

    override fun toString(): String {
        return ("Camera(regular_price:$regular_price, iva:$iva, manufacturer:$manufacturer)")
    }

    override fun compute_Special_Customer_Price(): Double {
        return regular_price-205
    }


}