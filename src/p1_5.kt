fun main()
{
    print("Enter month:")
    val month=readLine()!!.toString()
    when(month){
        "1" -> println("January")
        "2" -> println("Febuaray")
        "3" -> println("March")
        "4" -> println("April")
        "5" -> println("May")
        "6" -> println("June")
        "7" -> println("July")
        "8" -> println("August")
        "9" -> println("September")
        "10" -> println("October")
        "11" -> println("November")
        "12" -> println("December")
        else -> println("Incorrect!! enter valid number")
    }
}
