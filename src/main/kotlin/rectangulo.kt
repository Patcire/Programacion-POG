class rectangulo {

    var base=0
    var altura=0
    var nombre=""

    fun area(): Int{
        var area=base*altura
        return (area)
    }


    fun perimetro():Int{
        var perimetro=2*base+2*altura
        return (perimetro)
    }

    override fun toString(): String {
        return "rectangulo(base=$base, altura=$altura)"
    }


}