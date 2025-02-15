import java.awt.geom.AffineTransform

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val doubleNum = numbers.map{numbers -> numbers * 2}
    println(doubleNum)

    val names = mutableListOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")

    val filterNames = names.filter { it.startsWith("A") }
    println(filterNames)

    val words = listOf("apple", "banana", "kiwi", "strawberry", "grape")

    val descendingWords = words.sortedByDescending { it.length }
    println(descendingWords)

    val greaterThanFive = customFilter(numbers) { it > 5 }
    println("Numbers greater than 5: $greaterThanFive")

    val evenNumbers = customFilter(numbers) { it % 2 == 0 }
    println("Numbers even: $evenNumbers")

    val multipleOf3 = customFilter(numbers) { it % 3 == 0 }
println("Numbers multiple of 3: $multipleOf3")

    val processNum = processNumbers(numbers, { it % 2 != 0 }, {it*it})
    println(processNum)

    val processNewNum = processNumbers(numbers, { it <= 6 }, {it*2})
    println(processNewNum)

}

fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter { filter(it) }
}
fun processNumbers(numbers: List<Int>, filter: (Int) -> Boolean, transform: (Int) -> Int): List<Int> {

    val filterOddNumbers = numbers.filter(filter)

    return filterOddNumbers.map(transform)

}

