fun main(){
    val user1 = Users("Moin","Khan",19)

    val user2 by lazy {                    // Lazy Initialization
        Users("Vivek","Rajak",21)
    }
    println(user2.firstName)
    val user3 = Users("Abdul","Shaikh",19)

}

                                   // Lazy Initialization :
class Users(var firstName:String,var lastName:String,var age:Int){

    init {
        println("User $firstName was created!")
    }

    fun showDetails(){
        println("Name: ${this.firstName}")
        println("LastName: ${this.lastName}")
        println("Age: ${this.age}")
        println("=====================")
    }
}