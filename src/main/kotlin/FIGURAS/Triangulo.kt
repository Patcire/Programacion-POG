package FIGURAS

class Triangulo:Poligono {

    var base_triang=5.0
    var altura_triang=4.0
    var lado1=0.0
    var lado2=0.0
    var lado3=0.0

    //AL NO TENER UN CONSTRUCTOR PRINCIPAL, EL SECUNDARIO LLAMA DIRECTAMENTE AL PADRE
    constructor(num_lados_triang:Int, base: Double, altura: Double, lado_uno:Double,
                lado_dos:Double, lado_tres: Double)
                :super(3){

                    base_triang=base
                    altura_triang=altura
                    lado1=lado_uno
                    lado2=lado_dos
                    lado3=lado_tres
            }

    override fun calcular_area(): Double {
        return (base_triang*altura_triang)/2
    }

    override fun calcular_perimetro(): Double {
        return (lado1+lado2+lado3)
    }

}