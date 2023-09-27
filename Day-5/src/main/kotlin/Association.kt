fun main(){
    var numbers = listOf("one","two","three","four")
    println(numbers.associateWith { it.length }) // {One=3, Two=3, Three=5, Four=4}
    println(numbers.associateBy { it.first().uppercase() }) // {O=one, T=three, F=four} -> No duplicate
    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
    // Output:) {O=3, T=5, F=4}

}