fun main() {
    val bee = Nasek("Пчела", 10, "желто-черная", "Нектар", "цветы")
    val monarch = Butterfly("Бабочка Монарх", 8, "оранжево-черная", "молочный нектар", "")
    val damselfly = Dragonfly("Стрекоза", 12, "синяя", "мелкие насекомые", "пруды", "острым зрением")
    println("Пчела: ${bee.name}, $${bee.speed} км/ч, ${bee.color}, ${bee.food}, ${bee.sreda}")
    println("Бабочка-Монарх: ${monarch.name}, ${monarch.speed} км/ч, ${monarch.color}, ${monarch.food}, ${monarch.sreda}")
    println("Стрекоза: ${damselfly.name}, ${damselfly.speed} км/ч, ${damselfly.color}, ${damselfly.food}, ${damselfly.sreda}, ${damselfly.huntingSkill}")
    monarch.flutter()
    damselfly.hunt()
}