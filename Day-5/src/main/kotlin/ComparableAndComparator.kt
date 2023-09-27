fun main() {
    var numbers = mutableListOf(12,5,72,100,58,85)
    numbers.sorted().forEach({ println(it) })

    val laptops = mutableListOf<Laptop>()
    laptops.add(Laptop("Lenovo",8,40000))
    laptops.add(Laptop("Hp",10,30000))
    laptops.add(Laptop("Dell",6,35000))

    laptops.sortedWith(compareBy({it.price})).forEach({ println(it) }) // Easy way to sort without writing full implementation of comparator
    println("=========================================================")
    laptops.sortedWith(compareBy({it.ram})).forEach({ println(it) })
    laptops.sortedWith(compareBy<Laptop>{it.ram}.thenBy { it.price }).forEach({ println(it) }) // When we have to use 2 condition
    println("=========================================================")
    laptops.sortedBy { it.brand }.forEach({ println(it) }) // more shorted and easy way



//    println("===============================")
//    laptops.sorted().forEach({ println(it) })
//    println("================================")
//    laptops.sortedWith(ComparatorRam()).forEach({ println(it) })
}

data class Laptop(val brand:String,var ram:Int,var price:Int) // :Comparable<Laptop>
//    override fun compareTo(other: Laptop): Int {
//        if (this.price > other.price){
//            println("In if statement: Swapping ${this.brand} with ${other.brand}")
//            return 1
//        }else if (this.price < other.price){
//            println("In else if statement: Swapping ${this.brand} with ${other.brand}")
//            return -1
//        }else{
//            return 0
//        }
//    }

//}

//class ComparatorRam:Comparator<Laptop>{
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.ram > laptop2.ram){
//            return 1
//        }else if (laptop1.ram < laptop2.ram){
//            return -1
//        }else{
//            return 0
//        }
//    }
//
//}