fun main(){
    val user1 = User("Moin","Khan",19)
    val user2 = User("Moin","Khan",19)
    println(user1.equals(user2)) // We can use equals method
    println(user1 == user2)  // We can also use == operator
    println(user1) // We had override the toString method in User class so we will not get the address
    println(user2)// User(firstName: Moin , lastName: Khan , age: 19)
}

//                                           Data class :
class User(var firstName:String,var lastName:String,var age:Int){

// If overriding equals method than it is mandatory to also override the hascode method(In Collection)
    override fun equals(other: Any?): Boolean {
        if(this === other){
            return true
        }
        if(other is User){
            return this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age
        }
        return false
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "User(firstName: $firstName , lastName: $lastName , age: $age)"
    }
}
