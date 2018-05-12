package co.com.jetprogramming

class Home(val x: String, val r: Int) : Volar {

	fun getHello(): String {
		println("Nombre: $x y tiene una edad de $r")
		return "hello service"
	}

	override fun iniciar() {
		println("Fly")
	}
}