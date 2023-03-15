class Persona(DNI:String, sus_cuentas: MutableList<Cuenta>) {

    var dni=""
        get(){
            return field
        }

        set(value) {
            field = value
        }
    var lista_cuentas= mutableListOf<Cuenta>()
        get(){
            return field
        }

        set(value) {
            if (lista_cuentas.size <=3 || lista_cuentas.size>0){
                field = value
            }
           else{

               //al crear un objeto, si lo hacemos con una lista con más de 3 cuentas cogemos las tres primeras
               //pero si modificamos (x ejemplo añadir una lista con + de 3 no haría nada y se quedaría con las
               // 3 originales, y saldría este mensaje:
               println("Error, no puede tener más de 3 cuentas")
            }
        }

    init {
        dni= DNI

        if (sus_cuentas.size<=3){
            lista_cuentas= sus_cuentas
        }
        else{
            lista_cuentas=sus_cuentas.subList(0,2)
            }
    }

    //Este constructor es para si me pasan una sola cuenta
    //en vez de una lista, lo creo con una cuenta. A su vez, le paso una lista a la que le meto esa nueva cuenta
    constructor(DNI: String, nuevaCuenta: Cuenta): this(DNI, mutableListOf()){
        lista_cuentas.add(nuevaCuenta)
    }
        //solo con dni
        constructor(DNI: String): this(DNI, mutableListOf())

    fun moroso(){
        for (i in lista_cuentas){
            if (i.fondos<0){
                println(" Esta persona es una morosa.\n")
            }
            else{
                println("Esta persona no está en la lista de morosxs\n")
            }
        }
    }

    fun imprimir() {
        println( "Persona(dni='$dni', lista_cuentas=$lista_cuentas)")
    }




}