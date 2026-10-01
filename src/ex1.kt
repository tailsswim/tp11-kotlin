fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val x = 12
    val y = 4

    val somme = calculate(x, y) { a, b -> a + b }
    val soustraction = calculate(x, y) { a, b -> a - b }
    val multiplication = calculate(x, y) { a, b -> a * b }

    println("Somme : $somme")
    println("Soustraction : $soustraction")
    println("Multiplication : $multiplication")
}
