import co.com.jetprogramming.Home
import co.com.jetprogramming.Persona


fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int): Int {
	return fn(v1, v2)
}

fun sumar(x1: Int, x2: Int) = x1 + x2

fun restar(x1: Int, x2: Int) = x1 - x2

fun multiplicar(x1: Int, x2: Int) = x1 * x2

fun dividir(x1: Int, x2: Int) = x1 / x2


fun mayorEstadosUnidos(edad: Int): Boolean {
	return (edad >= 21)
}

fun mayorArgentina(edad: Int): Boolean {
	return (edad >= 18)
}

fun main(args: Array<String>) {
	val home: Home = Home("Jorge", 3)
	val ds = home.getHello()
	home.iniciar()
	println(ds)
	val resu1 = operar(10, 5, ::sumar)
	println("La suma de 10 y 5 es $resu1")
	val resu2 = operar(5, 2, ::sumar)
	println("La suma de 5 y 2 es $resu2")
	println("La resta de 100 y 40 es ${operar(100, 40, ::restar)}")
	println("El producto entre 5 y 20 es ${operar(5, 20, ::multiplicar)}")
	println("La división entre 10 y 5 es ${operar(10, 5, ::dividir)}")
	//Example of functional programming
	val persona1 = Persona("juan", 18)
	if (persona1.esMayor(::mayorArgentina))
		println("${persona1.nombre} es mayor si vive en Colombia")
	else
		println("${persona1.nombre} no es mayor si vive en Colombia")
	var cadena1: String? = null
	println(cadena1?.length)
	val list = listOf('a', 'b', 'c')
	println(list.size) // 3
	println("list.contains('a') is ${list.contains('a')}") // true
	println(list.indexOf('b')) // 1
	println(list[2]) // c
	var personList: MutableList<Persona> = mutableListOf<Persona>()
	val jorge: Persona = Persona("jorge", 123)
	personList.add(jorge)
	personList.forEach {
		println("The element is $it")
	}

}