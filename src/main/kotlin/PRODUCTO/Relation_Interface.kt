package PRODUCTO

interface Relation_Interface {

    //creo las funciones abstractas necesarias
    //SI ESTAS FUNCIONES LAS HICIERA EN UNA CLASE ABSTRACTA ME PEDIRÍA HACER EL OVERRIDE
    //EN LA CLASE QUE HEREDA DE ELLA, PERO AL SER UNA INTERFAZ NO

    abstract fun isGreater(a:Any):Boolean
    abstract fun isLess(a :Any):Boolean
    abstract fun isEqual(a:Any):Boolean

}