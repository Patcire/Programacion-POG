fun main(args: Array<String>) {

   var cuenta1= Cuenta(1111,700)
   var cuenta2= Cuenta(44444, 0)
   var varias_cuentas= mutableListOf<Cuenta>()
    varias_cuentas.add(cuenta1)
    varias_cuentas.add(Cuenta(66666,1300))


    var pepe = Persona("123", varias_cuentas)

    var antonio= Persona("444", cuenta2)


}

