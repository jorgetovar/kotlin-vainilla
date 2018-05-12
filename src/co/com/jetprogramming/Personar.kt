package co.com.jetprogramming

data class Persona(val nombre: String, val edad: Int) {
	fun esMayor(fn: (Int) -> Boolean): Boolean {
		return fn(edad)
	}
}

