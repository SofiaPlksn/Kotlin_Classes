class Message(private val username: String) {
    fun introduce() {
        println("Привет, меня зовут $username")
    }
}
fun main() {
    val user = Message("Софья")
    user.introduce()
}
