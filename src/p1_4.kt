fun main() {
    print("Enter a number:")
    val number = readLine()!!.toInt()

    println("$number is " + if (number % 2 == 0) "even" else "odd")
}

