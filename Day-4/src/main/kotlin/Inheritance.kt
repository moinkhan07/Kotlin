import java.awt.ComponentOrientation

fun main(){
                                  //    Inheitance Example : 1
//    val car1 = Car("Audi","Red",2,4)
//    car1.move()
//    car1.stop()
//    car1.showVehicleDetails()
//    println("===================================")
//    val aeroplane1 = Aeroplane("Air India","Blue and White",4,8)
//    aeroplane1.move()
//    aeroplane1.stop()

                                  //   Inheritance Example: 2
    val view = View()
    val btn = Button("Login","Center")
    val roundButton = RoundButton("Login","Bottom",10)
    println("===========Below is roundButton class===========")
    roundButton.draw()
    println("===========Below is Button clas=========")
    btn.draw()
    println("===========Below is View class===========")
    view.draw()
}

                                 // Inheritance Example : 1
open class Vehicle(var name:String,var color:String){  // Open keyword is important for inherit
    open fun move(){ // For overriding the function we use open keyword
        println("$name is moving...")
    }
    open fun stop(){ // For overriding the function we use open keyword
        println("$name is stopped!")
    }
}

open class Car(name:String,color: String,var door:Int,var engines:Int):Vehicle(name,color){

    fun showVehicleDetails(){
        println("Name: ${this.name}")
        println("Colour: ${this.color}")
        println("Engines: ${this.engines}")
        println("Door: ${this.door}")
    }
}

class Aeroplane(name:String,color: String,var door:Int,var engines:Int):Vehicle(name,color){
    override fun move() {// For override : Go to code -> Generate -> override method -> select -> open
        println("$name is flying...")
//        flying()
//        super.move()
    }

//    fun flying(){
//        println("$name is flying...")
//    }

    override fun stop() {
        super.stop()
    }
}

                                  // Inheritance Example : 2
open class View(){
    open fun draw(){
        println("Drawing the view...")
    }
}

open class Button(var text:String,var orientation:String):View(){
    override fun draw() {
        println("Drawing the button.")
        super.draw() // This will print the println of the view.draw() function
    }
}

class RoundButton(text:String,orientation: String,var corners:Int):Button(text,orientation){
    override fun draw() {
        println("Drawing the corners of the button!")
        super.draw() // This will print the println of the view.draw() function
    }
}