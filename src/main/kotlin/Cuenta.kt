class Cuenta (num_cuenta: Int, Saldo: Int) {
//voy a considerar que el num de cuenta tiene letras

    var numero= 0
        get(){
            return field
        }

        set(value) {
            if (numero < 0) {
                println("No puede ser negativo")

            } else {
                field = value
            }
        }
    var fondos=0

        get(){
            return field
        }

        set(value) {
            field = value
        }


    init{
        numero=num_cuenta
        fondos= Saldo
    }

    fun consultar(){
        println("La cuenta con número ${this.numero} tiene un saldo de ${this.fondos}")

    }

    fun recibir(recibe: Int){
        this.fondos=fondos+recibe
        println("Operación correcta\n")
    }

    fun pagar(pago: Int){

        this.fondos=fondos-pago
        println("Dinero correctamente descontado")
    }

}