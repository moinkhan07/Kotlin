fun main(args: Array<String>) {
    var user1 = User("Moin","Khan",19)
    var user2 = User("Moin")
    var user3 = User("Moin",19)
    var user4 = User("Moin","Khan")

    user1.showDetails()
    user2.showDetails()
    user3.showDetails()
    user4.showDetails()
}

// Secondary Constructor
class User(var name:String,var lastName:String,var age:Int){

    // Secondary Constructors
    constructor(name:String):this(name,"NA",0)
    constructor(name:String,lastName: String):this(name,lastName,0)
    constructor(name:String,age: Int):this(name,"NA",age)


    fun showDetails(){
        println("Name: ${this.name}, LastName: ${this.lastName}, Age: ${this.age}")
    }
}