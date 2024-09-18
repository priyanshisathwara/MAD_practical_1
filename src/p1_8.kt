fun main() {
    val arr1=arrayOf(1,2,3,4,5,6,7,8)
    println("Array-1 by using arrayOf() method :${arr1.joinToString()}")

    val arr2=Array<Int>(5){0}
    println("Array-2 by using Array<> :${arr2.joinToString()}")
    val arr3=Array<Int>(8){i: Int ->i }
    println("Array-3 by using Array<> and lambda function :${arr3.joinToString()}")
    val arr4=IntArray(5){0}
    println("Array-4 by using IntArray() :${arr4.joinToString()}")
    val arr5=intArrayOf(11,22,33,44,55)
    println("Array-5 by using intArrayOf() :${arr5.joinToString()}")

    val arr6=arrayOf(intArrayOf(4,5),intArrayOf(3,1))
    println("Array-6 by using intArrayOf() and arrayOf():${arr6.contentDeepToString()}")
    val arr7=IntArray(5)
    for (i in 0 until 5) {
        println("Enter element for $i:")
        arr7[i] = readLine()!!.toInt()
    }
    println("Array-7 by taking user input values:${arr7.joinToString()}")
    arr7.sort()
    println("After sorting array by using built-in method:${arr7.joinToString()}")
    for (i in arr7.indices) {
        for (j in 0 until arr7.size - i - 1) {
            if (arr7[j] > arr7[j + 1]) {
// Swap array[j] and array[j + 1]
                val temp = arr7[j]
                arr7[j] = arr7[j + 1]
                arr7[j + 1] = temp
            }
        }
    }
    println("Array sorted without built-in methods: ${arr7.joinToString(", ")}")
}