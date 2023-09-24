fun main(){
//    var car1 = Car("Tesla","Red","Eviana") // object of the car
//    car1.name = "Tesla"
//    car1.color = "Red"
//    car1.model = "Eviana"

//    println("Name : ${car1.name}")
//    println("Color : ${car1.color}")
//    println("Model : ${car1.model}")
//
//    car1.accelerate()
//    car1.stop()

//    =================================================================

//    val user1 = User("Moin",19,"Mumbai")
//    println("Name: ${user1.name}")
//    println("Age: ${user1.age}")
//    println("Address: ${user1.address}")

//    ==================================================================
    val person1 = Person("Moin","Khan",19)

}

// classes and primary constructor Example
class Car(var name:String,var color: String,var model:String) {   // Class declared
// Also entering parameter is the primary constructor

//    var name = name.trim()  // For removing space we can use trim() Function/Method
//    var color = ""  // We can decalred like this or we can use constructor
//    var model =  ""

//    fun accelerate(){  // Class methods/function
//        println("The $name is running which is in $color colour.")
//    }
//
//    fun stop(){  // Class methods/function
//        println("The $name is stopped!")
//    }
}

// Initializer Block Example
class User(name:String,var age:Int,var address:String){
    var name:String

   init {                                            //Initializer Block
       if(name.lowercase().startsWith('m')){
           this.name = name
       }else{
           this.name = "User"
           println("The name should be starts with 'm' or 'M' ")
       }
   }
}

// Secondary Constructor
class Person(var name:String,var lastName:String,var age:Int){
    
}
