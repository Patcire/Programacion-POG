package HERENCIA

class Programador:Empleado {


    //forma larga

    constructor(Nombre:String, Apellidos: String, DNI: String, fecha_contrato: String,
                sueldo_base : Double, base_horas_extras : Double, num_horas_extra:Int) :
            super(Nombre, Apellidos, DNI, fecha_contrato,
            sueldo_base, base_horas_extras, num_horas_extra)


    //forma corta
    //constructor(emp: Empleado) : super (Nombre, Apellidos, DNI)


    //por defecto
    constructor(): this ("deefcto", "ninguno", "123456789", "ninguna",
        0.0, 0.0, 0,)


    open fun pedir_vacas(): String {

        return ("Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede\n" +
                "coger vacaciones\n")

    }

    open fun pedir_aumento(): String{
        return ("El jefe de departamento está de vacaciones inténtelo de nuevo cuando\n" +
                "vuelva\n")
    }


    open fun imprimir_nomina(){
        println(
                    "NÓMINA\n"+
                    "------\n"+
                    "DNI: $dni\n"+
                    "Nombre: $nomb y $apell\n"+
                    "Sueldo: ${this.calcular_sueldo()}\n"
        )
    }
}