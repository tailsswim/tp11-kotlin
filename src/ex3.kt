fun main() {
    val liste = listOf(10, 20, 30, 40, 50, 60)

    val calculerSomme = fun(fren: List<Int>): Int {
        var somme = 0
        for (num in fren) {
            somme += num
        }
        return somme
    }

    val resultat = calculerSomme(liste)
    println("La somme de la liste est : $resultat")
}
