fun performArithmeticOperation(num1: Int, num2: Int, operation: String): Int {
    when (operation.lowercase()) {
        "add" -> return num1 + num2
        "subtract" -> return num1 - num2
        "multiply" -> return num1 * num2
        "divide" -> return num1 / num2
        else -> throw IllegalArgumentException("Invalid operation: $operation")
    }
}

fun main() {
    println("enter 1st number :")
    val num1 = readLine()!!.toInt()
    println("enter 2nd number :")
    val num2 = readLine()!!.toInt()

    println(performArithmeticOperation(num1, num2, "add"))
    println(performArithmeticOperation(num1, num2, "subtract"))
    println(performArithmeticOperation(num1, num2, "multiply"))
    println(performArithmeticOperation(num1, num2, "divide"))
}