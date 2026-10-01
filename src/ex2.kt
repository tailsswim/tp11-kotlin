fun main() {
    val nombres = List(10) { (1..20).random() }
    println("Liste d'origine : $nombres")

    val pairs = nombres.filter { it % 2 == 0 }
    val impairs = nombres.filter { it % 2 != 0 }

    val seuil = 10
    val superieurs = nombres.filter { it > seuil }

    println("Nombres pairs : $pairs")
    println("Nombres impairs : $impairs")
    println("Nombres > $seuil : $superieurs")
}
