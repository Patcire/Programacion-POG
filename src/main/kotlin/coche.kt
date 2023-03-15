class coche (color: String, marca: String, modelo: String,
             caballos:Int, numpuertas:Int, matricula: String){

    var color=color
    var marca=marca
    var modelo=modelo
    var caballos=caballos
    var numpuertas=numpuertas
    var matricula=matricula

constructor(color: String, marca: String, modelo: String,
            caballos:Int, numpuertas:Int): this(color, marca, modelo, caballos, numpuertas, "00XX")

    override fun toString(): String {
        return "coche(color='$color', marca='$marca', modelo='$modelo', caballos=$caballos, numpuertas=$numpuertas, matricula='$matricula')"
    }


}

