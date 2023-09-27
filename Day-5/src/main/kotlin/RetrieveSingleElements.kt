fun main() {
    var numbersInString = listOf("one","two","three","four","five")
    println(numbersInString.elementAt(3)) // four
    println(numbersInString.first()) // one
    println(numbersInString.last()) // five
    println(numbersInString.first { it.length > 3 }) // three
    println(numbersInString.last { it.startsWith('f') }) // five
    println(numbersInString.random()) // Give us any random number from the "numbersInString" list
    println(numbersInString.isEmpty()) // Boolean value here it will give use false
}