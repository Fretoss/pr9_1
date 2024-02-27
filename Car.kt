open class Car(val brand:String, val power:Int, val price:Double) {
    fun Thebest() {
        println("This is the best car in the world!!!")
    }
}
class SUV(brand:String, power:Int, price:Double, val offroadab: String):Car(brand,power,price){
    fun OffRoad() {
        println("$brand SUV if off-roading with $offroadab")
    }
}
class Sedan (brand:String,power:Int,price:Double,val numDoors:Int):Car(brand,power,price) {
    fun Drive(){
        println("$brand седан на дороге")
    }
}