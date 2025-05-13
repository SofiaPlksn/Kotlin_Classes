open class Animal(val food: String, val location: String) {
    open fun makeNoise() {
        println("Животное издает звук.")
    }
    open fun eat() {
        println("Животное ест.")
    }
    fun sleep() {
        println("Животное спит.")
    }
}

class Dog(food: String, location: String, val breed: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Собака лает.")
    }
    override fun eat() {
        println("Собака ест $food.")
    }
}

class Cat(food: String, location: String, val color: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Кошка мяукает.")
    }
    override fun eat() {
        println("Кошка ест $food.")
    }
}

class Horse(food: String, location: String, val speed: Int) : Animal(food, location) {
    override fun makeNoise() {
        println("Лошадь ржет.")
    }
    override fun eat() {
        println("Лошадь ест $food.")
    }
}

class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("На приеме: еда - ${animal.food}, местоположение - ${animal.location}")
    }
}

fun main() {
    val dog = Dog("мясо", "будка", "хаски")
    val cat = Cat("корм", "дом", "рыжий")
    val horse = Horse("сено", "конюшня", 50)

    val animals: List<Animal> = listOf(dog, cat, horse)

    val vet = Veterinarian()
    for (animal in animals) {
        animal.makeNoise()
        animal.eat()
        animal.sleep()
        vet.treatAnimal(animal)
        println("-----")
    }
}
