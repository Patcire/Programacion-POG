class Alumno ( DNI: String, Edad: Int, Nota_trimestre_1: Int, Nota_trimestre_2: Int, Nota_trimestre_3: Int) {


    var dni= DNI
        //no hay que poner get y set porque no hace falta comprobar nada

    var edad= Edad
    //no hay que poner get y set porque no hace falta comprobar nada

    var nota1= Nota_trimestre_1
        get(){
            return field
        }
        set(value){
            if (value > 10 || value < 1) {
                println("Error. La nota debe estar entre 1 y 10\n")
            } else {
                field = value
            }
        }

    var nota2 = Nota_trimestre_2
        get(){
            return field
        }
        set(value){
            if (value > 10 || value < 1) {
                println("Error. La nota debe estar entre 1 y 10\n")
            } else {
                field = value
            }
        }

    var nota3= Nota_trimestre_3
        get(){
            return field
        }
        set(value){
            if (value > 10 || value < 1) {
                println("Error. La nota debe estar entre 1 y 10\n")
            } else {
                field = value
            }
        }

    init {
        //El init llama al SET
        //el init es el código de bloque del constructor primario
        nota1=Nota_trimestre_1
        nota2=Nota_trimestre_2
        nota3=Nota_trimestre_3
    }

    //constructor solo para la edad y el dni
    constructor(DNI: String, Edad: Int): this(DNI, Edad, -1,-1,-1)

    //constructor para edad, dni y nota 1
    constructor(DNI: String, Edad: Int, Nota_trimestre_1: Int): this(DNI, Edad, Nota_trimestre_1,-1,-1)

    //constructor dni, edad, nota 1 y nota 2
    constructor(DNI: String, Edad: Int, Nota_trimestre_1: Int, Nota_trimestre_2: Int): this(DNI, Edad, Nota_trimestre_1, Nota_trimestre_2,-1)

    //constructor para copiar objetos
    constructor(copiaAlumno: Alumno): this(copiaAlumno.dni, copiaAlumno.edad, copiaAlumno.nota1, copiaAlumno.nota2, copiaAlumno.nota3)


    fun media():Int {

        var suma=nota1+nota2+nota3

        if (this.nota1==-1 || this.nota2==-1 || this.nota3==-1) {
            return -1

        }
        else{
            var media= suma/3
            return media
        }
    }

    override fun toString(): String {
        return "informeAlumno(dni='$dni', edad=$edad, nota1=$nota1, nota2=$nota2, nota3=$nota3, media=${media()})"
    }


}