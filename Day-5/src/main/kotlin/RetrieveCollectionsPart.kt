fun main(){
    val numbersInString = listOf("one","two","three","four","five","six")
    println(numbersInString.slice(1..3)) // [two, three, four]
    println(numbersInString.slice(0..4 step 2)) //  [one, three, five]
    println(numbersInString.slice(setOf(1,3,5))) // [two, four, six]

    println("\n")
    println(numbersInString.take(3)) // [one, two, three]
    println(numbersInString.takeLast(2)) // [five, six]
    println(numbersInString.drop(3)) // [four, five, six]
    println(numbersInString.dropLast(2)) // [one, two, three, four]

    println("\n")
    println(numbersInString.takeWhile { !it.startsWith('f') }) // [one, two, three]
    println(numbersInString.takeLastWhile { it != "three" }) // [four, five, six]
    println(numbersInString.dropWhile { it.length == 3 }) // [three, four, five, six]
    println(numbersInString.dropLastWhile { it.contains('i') }) // [one, two, three, four]

    println("\n")
    val numbers = (0..13).toList()
    println(numbers.chunked(3)) // [[0, 1, 2], [3, 4, 5], [6, 7, 8], [9, 10, 11], [12, 13]]
    println(numbers.chunked(3){it.sum()}) // [3, 12, 21, 30, 25]

    println(numbers.windowed(3))
// [[0, 1, 2], [1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5, 6], [5, 6, 7], [6, 7, 8], [7, 8, 9],
// [8, 9, 10], [9, 10, 11], [10, 11, 12], [11, 12, 13]]

    println("\n")
    var numbersStrings = numbersInString
    println(numbersStrings.windowed(3))
// [[one, two, three], [two, three, four], [three, four, five], [four, five, six]]

}



