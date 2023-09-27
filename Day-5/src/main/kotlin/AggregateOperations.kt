fun main() {
    val numbers = listOf(91,19,35,61,82,40,21,60)
    println("Sum is ${numbers.sum()}")
    println("Sum is ${numbers.sumOf{it * 2}}")
    println("Average is ${numbers.average()}")
    println("Count is ${numbers.count()}")
    println("Max Value is ${numbers.maxOrNull()}")
    println("Min Value is ${numbers.minOrNull()}")
    
}