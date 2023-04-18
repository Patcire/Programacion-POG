package PRODUCTO

class MP3Player:Electronics {

    var color_mp3=""

    constructor(regularPrice: Double, manufacturer:String, color:String)
            :super(regularPrice, manufacturer ){
                color_mp3=color
            }


    override fun compute_Sale_Price(): Double {
        return regular_price*0.9
    }

    override fun toString(): String {
        return "MP3Player(regular_price=${regular_price}, iva:$iva, manufacturer=$manufacturer , color_mp3='$color_mp3')"
    }

    //to String2 solo es para la actividad6 de E/S
    override fun toString2(): String{
        return("MP3Player#${regular_price}#$iva#$manufacturer#$color_mp3")
    }

    override fun compute_Special_Customer_Price(): Double {
        return regular_price-15
    }

}