fun main(){
//    val vehicle1 = VehicleInfo() // Cannot create instance of abstract class
    val sportsCar = SportCar("Ferrari","Red","350Km/hr",6)
    sportsCar.move()
    sportsCar.stop()
}

                                        // Abstract Class :
abstract class VehicleInfo(){
    abstract fun move()
    abstract fun stop()
}

class SportCar(var name:String,var color: String,var topSpeed:String,var engines:Int):VehicleInfo(){
    override fun move() {
        println("$name is moving...")
    }

    override fun stop() {
        println("$name is stopped!")
    }

}