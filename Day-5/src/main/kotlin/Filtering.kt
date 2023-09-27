fun main() {
    val numbers = listOf("one","two","three","four","five")
    println(numbers.filter{it.length > 3})

    val mapNumbers = mapOf("key 1" to 1,"key 2" to 2,"key 3" to 3,"key 4" to 4,"key 101" to 11)
    println(mapNumbers.filter { it.key.endsWith("1") && it.value > 10})
    println("=======================filterIndexed===================")
    val filteredIndex = numbers.filterIndexed { index, str ->  index != 0 && str.length < 5}
    println(filteredIndex) // two, four, five
    println("=======================filterNot===================")
    var filteredNot = numbers.filterNot { it.length <= 3 }
    println(filteredNot) // "three","four","five"
    println("=======================filterIsInstance===================")
    val mixedList = listOf("Moin","Vivek","Abdul",'A','B','C',1,2,3)
    println(mixedList.filterIsInstance<Int>().forEach { println(it)}) // Only Integers
    println(mixedList.filterIsInstance<Char>().forEach { println(it)}) // Only Characters
    println(mixedList.filterIsInstance<String>().forEach { println(it)}) // Only String
    println("=========================Partition=======================")
    val (match,rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)
}
