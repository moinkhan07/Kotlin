fun main(){
    val numberStr = listOf("one","two","three","four","five")
    println(numberStr) // [one, two, three, four, five]
    println(numberStr.joinToString()) // It will remove the [] in console :) one, two, three, four, five

    val listNumber = StringBuffer("The list of number:")
    println(numberStr.joinTo(listNumber)) // The list of number:one, two, three, four, five

    println(numberStr.joinToString(separator = " | ", prefix = "Start: ", postfix = ": End"))
    // Output :) Start: one | two | three | four | five: End

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 10, truncated = "<...>"))
    // Output:) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, <...>
}