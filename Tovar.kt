class tovar(
    val name: String,
    val price: Double,
    val izmer: String,
    val vid: String,
    val kol: String,
)
{
    fun info ()
    {
        println("Имя: $name")
        println("Цена: $price рублей")
        println("Единица измерения: $izmer")
        println("Вид товара: $vid")
        println("Количество товара: $kol $izmer")
    }
}
fun create(): tovar {
        println("Введите название товара:")
        val name = readLine()!!
        println("Введите цену:")
        val price = readLine()!!.toDouble()
        println("Введите единицу измерения:")
        val izmer = readLine()!!
        println("Введите вид товара:")
        val vid = readLine()!!
        println("Введите количество товара:")
        val kol = readLine()!!
        return tovar(name,price,izmer,vid,kol)
}
fun chekprice (tovar: tovar) {
     val chekpric = 1000.0
    if (tovar.price >= chekpric )
    {
        println("Цена товара ${tovar.name} высокая")
    } else {
        println("Цена товара ${tovar.name} низкая")
    }
}