fun main(){
    var colors = listOf("Red","White","Black")
    var animals = listOf("Lion","Tiger","Fox")
    println(colors.zip(animals)) // Use to pair between the 2 collections
//   Output:) [(Red, Lion), (White, Tiger), (Black, Fox)]
    println(colors zip animals) // Use to pair between the 2 collections -> Another way to zip
    println(colors.zip(animals){color,animal-> "The $animal is $color"} ) // Transformation

    var listOfNumbers = listOf("One" to 1,"Two" to 2,"Three" to 3,"Four" to 4)
    println(listOfNumbers)
    println(listOfNumbers.unzip()) // ([One, Two, Three, Four], [1, 2, 3, 4])
}