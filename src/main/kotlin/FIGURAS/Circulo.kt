package FIGURAS

import kotlin.math.PI

class Circulo(radio_cir:Double):Figura() {

    var radio=5.0

    override fun calcular_area(): Double {
        var area= PI*radio*radio
        return area
    }

    override fun calcular_perimetro(): Double {
        var perimetro=2*PI*radio
        return perimetro
    }

    init {
        radio=radio_cir
    }





}