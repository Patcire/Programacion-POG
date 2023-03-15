@file:Suppress("LanguageDetectionInspection")

package FIGURAS

class Rectangulo(base: Double, altura: Double): Poligono(4) {
//constuctor principal, con los atributos que recibe y el dato que recibe la clase padre
    var base=5.0
    var altura=2.0


    override fun calcular_area(): Double {
        return  base*altura
    }

    override fun calcular_perimetro(): Double {
        return base*2+altura*2
    }

    init {
        this.base=base
        this.altura=altura
    }

    //si quisiera hacer un secundario, este llama al principal y este llama al del padre
    //por tanto debería usar el this en vez de el super

    //Este constructor en específico sería para cuando la base y altura son la misma
    //(aunque entonces no sería un rectángulo)
    //el rectángulo recibe dos parámetros, entonces le paso los dos al principal
    constructor(longitud_lado:Double):this(longitud_lado, longitud_lado)


    //si queremos llamar directamente a los del padre deberíamos haberlo hecho sin tener
    //un constructor principal, solo con un secundario. EJEMPLO: MIRAR TRIANGULO
}