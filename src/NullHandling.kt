class LearningNullHandling {

    var NullString: String?
    var LengthOrNull: Int?

    init {
        NullString = "some string"
        LengthOrNull = NullString!!.length
    }
}

    fun main(args: Array<String>) {
        val learning: LearningNullHandling = LearningNullHandling()

        println("The string is ${learning.LengthOrNull} characters long")

        learning.NullString = null
        learning.LengthOrNull = learning.NullString?.length
        // learning.LengthOrNull = learning.NullString!!.length // throws a null pointer exception

        println("The null string is ${learning.LengthOrNull} characters long")
    }
