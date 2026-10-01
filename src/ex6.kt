class NegativeNumberException(message: String) : Exception(message)

fun convertToInt(chaine: String): Int? {
    return try {
        val nombre = chaine.toInt()

        if (nombre < 0) {
            throw NegativeNumberException("Le nombre est négatif : $nombre")
        }
        nombre
    } catch (e: NumberFormatException) {
        println("Erreur : '$chaine' n'est pas un entier valide.")
        null
    } catch (e: NegativeNumberException) {
        println("Erreur personnalisée : ${e.message}")
        null
    }
}

fun main() {
    println("--- Test '123' ---")
    convertToInt("123")

    println("\n--- Test '-45' ---")
    convertToInt("-45")

    println("\n--- Test 'abc' ---")
    convertToInt("abc")
}
