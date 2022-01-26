fun main(args: Array<String>) {
    println("Hello Jupiter!!")
    println("Estoy aprendiendo Kotlin desde el tuto de W3School")
    //Esto es un comentario, como en java
    println("Esta muy bueno, sobre todo porque no finalizamos con semicolon (;) las statments!")
    print("Aqui usaré la statement print: ")
    println(3 + 3)
    var name = "Jaz" //type String
    val birthday = 6 //type Int
    println(name + birthday)
    var explicacion : String
    explicacion = "para declarar un var sin asignar valor, primero se debe declarar su type"
    println(explicacion)
    val explicacion2 = "declarar val es igual a const, no se puede asignar otro valor despues"
    // explicacion2 = "esto no se puede hacer" //Eror val cannot be reassigned
    println(explicacion2)
    val x: Int = 5
    val y: Long = x.toLong() //casteamos una constante
    val isKotlinFun: Boolean = true // definimos tipo y asignamos valor en una misma linea
    println(isKotlinFun)
    println(explicacion[0]) //imprime el primer valor de la variable, en este caso la letra p
    println(y)
    println("la variable x interpolada tiene el valor $x y la variable y = $y")

    val time = 15
    val greeting = if (time < 18) "Good day" else "Good evening"
    println(greeting) //ejemplo de if sin {} y en una linea, similar al operador ternario en java

    //Creo un objeto Car
    val c1 = Car()

    //Accedo a las propiedades y sumo algunos valores
    c1.brand = "Tesla"
    c1.model = "Y3"
    c1.year = 2015

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}