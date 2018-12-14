package academy.learnprogramming.challenge1

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"
    println("referential equivalence: ${hello1 === hello2}")
    println("structural equivalence: ${hello1 == hello2}")

    val int1 = 2988
    println("integer variable: $int1")


    val var1: Any = "The Any type is the root of the Koltin class hierarchy"
    println("The variable in uppercase: ${var1.toString().toUpperCase()}")


    println("Tadam! $hello1 and $hello2")
}