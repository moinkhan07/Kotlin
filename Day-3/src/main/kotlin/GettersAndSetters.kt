fun main() {
    val userInfo1 = UserInfo("Moin","Khan",19)
//    userInfo1.setFirstName("Faisal")
    userInfo1.showDetails()
}

// Getters And Setters
class UserInfo(firstName:String, var lastName:String = "NA", var age:Int = 0){

    var name = firstName

        get() {
            return "FirstName: $field"
        }

        set(value) {
            println("$value is assigned!")
            field = value
        }

                   //    The above get() and set(value) function are working as follows:
//    fun setFirstName(newName:String){
//        this.name = newName
//    }
//    fun getFirstName():String{
//        return this.name
//    }

    fun showDetails(){
        println("Name: ${this.name}")
        println("LastName: ${this.lastName}")
        println("Age: ${this.age}")
        println("=====================")
    }
}