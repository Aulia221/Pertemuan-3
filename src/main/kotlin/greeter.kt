class Greeter {
    var text: String = ""
    fun greet() {
        println("Hello object word!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}