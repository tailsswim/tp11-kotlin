fun divide(dividende: Int, diviseur: Int): Int? {
    return try {
        dividende / diviseur
    } catch (e: ArithmeticException) {
        println("Erreur : Division par zéro impossible !")
        null
    }
}

fun main() {
    println("Résultat 10 / 2 : ${divide(10, 2)}")
    println("Résultat 10 / 0 : ${divide(10, 0)}")
}
