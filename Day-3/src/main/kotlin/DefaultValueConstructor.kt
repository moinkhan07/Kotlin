fun main() {
    val person1 = Person("Moin","Khan",19)
    val person2 = Person(lastName = "Khan")
    val person3 = Person("Moin", age = 19)
    val person4 = Person("Moin","Khan")

    person1.showDetails()
    person2.showDetails()
    person3.showDetails()
    person4.showDetails()
}

// Constructor Parameter Default Value
class Person(var name:String = "NA",var lastName:String = "NA",var age:Int = 0){

    fun showDetails(){
        println("Name: ${this.name}")
        println("LastName: ${this.lastName}")
        println("Age: ${this.age}")
        println("=====================")
    }
}