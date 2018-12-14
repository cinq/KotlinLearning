// String template examples


fun main(args: Array<String>) {
    val person1 = Person("Doe", "John", 25)

    println("The first person that I know is ${person1.firstname}.")
    println()

    val rawStr1 = """Many lines of text
        |is trimmed automatically by Intellij
        |so it is easy to do this right and look good
    """.trimMargin()
    println(rawStr1)
    println()
}

class Person (val lastname: String, val firstname: String, val age: Int)