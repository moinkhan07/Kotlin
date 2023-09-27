fun main() {
    val numbers = listOf("one","two","three","four","five","six")
    println(numbers.groupBy { it.first().uppercase() })
//  Output :) {O=[one], T=[two, three], F=[four, five], S=[six]}
    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()} ))
//  Output :) {o=[ONE], t=[TWO, THREE], f=[FOUR, FIVE], s=[SIX]}
}