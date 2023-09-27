fun main(){ // Flatten helps to convert 2 dimensional array into 1 dimensional array.
    val numbersSet = listOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
    
    for(numbers in numbersSet){
        for(number in numbers){
            print("$number ")
        }
        println()
    }

   val numbersFlatten = numbersSet.flatten()
    println(numbersFlatten) //Output:) [1, 2, 3, 4, 5, 6, 7, 8, 9]

}