class Car(val type: String, val model: String, private val originalPrice:
Double, var owner: String, var milesDriven: Int) {
    fun getCarInfo(): String {
        return "Type: $type, Model: $model, Owner: $owner, Miles Driven:$milesDriven"
    }

    fun getOriginalPrice(): Double {
        return originalPrice
    }

    fun getCurrentPrice(): Double {
        val depreciation = milesDriven / 10000 * 0.1 * originalPrice
        return originalPrice - depreciation
    }

    fun displayCarInfo() {
        println(getCarInfo())
        println("Original Price: $${getOriginalPrice()}")
        println("Current Price: $${getCurrentPrice()}")
    }
}

fun main() {
    val car1 = Car("BMW", "2017", 300000.0, "aarvi", 105)
    car1.displayCarInfo()
    val car2 = Car("BMW", "2018", 490000.0, "bindu", 20)
    car2.displayCarInfo()
    val car3 = Car("Toyota", "2019", 1000000.0, "pryanshi", 100)
    car3.displayCarInfo()
    val car4 = Car("Maruti", "2016", 4600000.0, "dhrasti", 200)
    car4.displayCarInfo()
}
