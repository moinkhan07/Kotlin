fun main(args: Array<String>) {
//    val listOfStudents = listOf<String>() // This is Immutable listOf -> Value is fixed
    val listOfStudents = mutableListOf<String>() // This is mutableListOf -> We can add more value
    listOfStudents.add("Moin")
    listOfStudents.add("abdul")
    listOfStudents.add("Moin")
    listOfStudents.forEach { println(it) }

    //    val setOfStudents = setOf<String>() // This Immutable setOf -> Value is fixed
    val setOfStudents = mutableSetOf<String>() // This is mutableSetOf -> We can add more value
    setOfStudents.add("Moin")
    setOfStudents.add("abdul")
    setOfStudents.add("Moin")
    setOfStudents.forEach { println(it) }

//    val mapOfStudents = mapOf<Int,String>() // This Immutable mapOf -> Value is fixed
    val mapOfStudents = mutableMapOf<Int,String>() // This MutableMapOf -> We can add more value
    mapOfStudents.put(1,"Moin")
    mapOfStudents.put(2,"abdul")
    mapOfStudents.put(3,"Moin")
    mapOfStudents.put(1,"Moin")
    mapOfStudents.forEach { println("${it.key} = ${it.value}") }


}
