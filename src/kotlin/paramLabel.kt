// when calling a function you can label the param that you are passing
fun main(args: Array<String>) {
    param2(1, 2)
    param2(first = 1, second = 2)
    param2(second=22, first=11)
}

fun param2(first: Int, second: Int) {
    println("First param is $first and the second is $second")
}
