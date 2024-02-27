open class Butterfly (
    name: String,
    speed: Int,
    color: String,
    food: String,
    sreda: String
) : Nasek(name, speed, color, food, sreda) {
    open fun flutter() {
        println("$name порхает вокруг")
    }
}