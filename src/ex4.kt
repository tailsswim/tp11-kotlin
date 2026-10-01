fun main() {
    val estPair = fun(nombre: Int): Boolean {
        return nombre % 2 == 0
    }

    val testNombres = listOf(5, 12, 23, 44, 0)

    for (nb in testNombres) {
        if (estPair(nb)) {
            println("$nb est pair")
        } else {
            println("$nb est impair")
        }
    }
}
