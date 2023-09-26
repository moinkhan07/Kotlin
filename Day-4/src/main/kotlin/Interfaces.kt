fun main(){
    val car1 = Cars("Lamborgini","Red")
    car1.startEngine()
    val truck1 = Truck("Toyota","Black")
}
interface Engines{
    fun startEngine()
}

class Cars(var name:String,var color:String):Engines{
    override fun startEngine() {
        println("$name is Starting which is in $color colour")
    }

}
class Truck(var name:String,var color:String):Engines{
    override fun startEngine() {
        println("$name is Starting which is in $color colour")
    }

}