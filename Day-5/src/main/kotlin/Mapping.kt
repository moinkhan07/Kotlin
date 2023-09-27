fun main(){
    val sets = setOf(1,2,3,4,5,6,7,8,9,10)
    println(sets.map { it * 10 })
    println(sets.map{if (it % 2 == 0) println(it) })
    println(sets.map { if (it == 3) it * 200 else it * 10 })

    val maps = mapOf("key1" to 1,"key2" to 2,"key3" to 3,"key4" to 4,"key5" to 5)
    println(maps.mapKeys { it.key.uppercase()})
    println(maps.mapValues { it.value + it.key.length })
}

