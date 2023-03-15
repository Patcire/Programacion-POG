class Tiempo  (Hora: Int, Minutos:Int, Segundos: Int){

    var hora=Hora
    var min=Minutos
    var seg=Segundos


    //para hora y min

    constructor(Hora: Int, Minutos:Int): this(Hora, Minutos, 0)

    //solo para hora
    constructor(Hora: Int): this(Hora, 0, 0)

    override fun toString(): String {
        return "$hora h $min min $seg seg"
    }


}

