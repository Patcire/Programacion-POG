package HERENCIA

class Directivo: Empleado {

    protected var plus=0.0
        get(){
            return field
        }

        set(value) {
            if (value<0){
                println("Error, el plus no puede ser menor que 10\n")
            }
            else{
                field = value
            }

        }
    protected var diets=0.0
        get(){
            return field
        }

        set(value) {
            if (value<0){
                println("Error, las dietas no pueden ser menor que 10\n")
            }
            else{
                field = value
            }

        }


    protected var cargo=""
        get(){
            return field
        }

        set(value) {
            if (value.length>50){
                println("Error, debe definir su cargo en 50 caracteres o menos\n")
            }
            else{
                field = value
            }

        }


    //constructor por parámetros
    constructor(Nombre:String, Apellidos: String, DNI: String, fecha_contrato: String,
                sueldo_base : Double, base_horas_extras : Double, num_horas_extra:Int, Plus_direccion: Double, Dietas: Double,
                Cargo: String):super(Nombre, Apellidos, DNI, fecha_contrato, sueldo_base, base_horas_extras, num_horas_extra){

            plus=Plus_direccion
            diets=Dietas
            cargo=Cargo

    }

    //constructor por defectos
    constructor():this("defecto","ninguno","123456789","ninguno",0.0,
        0.0, 0, 0.0, 0.0, "defecto")

    override fun calcular_sueldo(): Double {

        return super.calcular_sueldo()+diets+plus
    }

    open fun imprimir_nomina(){
        println(
            "NÓMINA\n"+
            "------"+
            "DNI: $dni\n"+
            "Nombre: $nomb y $apell\n"+
            "Cargo: $cargo\n"+

            //el this no es necesario, ya que si no digo nada es del propio objeto

            "Sueldo: ${this.calcular_sueldo()}\n"
        )
        //esta función podría llamar a la función de empleado y solo le añado cargo, hacer un override
        //como con calcular_sueldo
    }

}