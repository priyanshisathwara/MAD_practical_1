open class Animal {
    open fun makeSound() {
        println("Generic animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        super.makeSound() // Call the base class's implementation
        println("Woof!")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        super.makeSound() // Call the base class's implementation
        println("Meow!")
    }
}

fun main(){
    val animals = listOf(Dog(), Cat())
    for (animal in animals) {
        animal.makeSound()
    }
}