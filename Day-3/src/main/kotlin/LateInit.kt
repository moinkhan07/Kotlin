fun main() {
    val userData1 = UserData("Moin","Khan",19)
    userData1.userFavouriteMovie = "Jawan"

    userData1.showDetails()
}

                                     // Late Init :
class UserData(var firstName:String, var lastName:String, var age:Int){

    lateinit var userFavouriteMovie:String  // Using lateinit we can assigned value later.


    fun showDetails(){
        println("FirstName: ${this.firstName}")
        println("LastName: ${this.lastName}")
        println("Age: ${this.age}")
        println("Favourite Movie: ${this.userFavouriteMovie}")
        println("=====================")
    }
}