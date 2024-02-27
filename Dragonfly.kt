open class Dragonfly (name: String,
speed: Int,
color: String,
food: String,
sreda: String,
val huntingSkill: String
) : Nasek(name, speed, color, food, sreda) {
    open fun hunt() {
        println("$name охотится за добычей с $huntingSkill")
    }
}