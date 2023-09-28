// It always works with the sorted element
fun main() {
//    println(linearSearchNumber(12, mutableListOf(1,2,3,5,7,9,12) ))  // Linear search

//    println(binarySearchNumber(12, mutableListOf(1,2,3,5,7,9,12) ))  // Binary search

    println(binarySearch(27, mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30) ))  // Linear search
}

//  Binary search :) Collection framework
private fun binarySearch(searchedElement:Int,numbers:MutableList<Int>):Int{
    return numbers[numbers.binarySearch(searchedElement)]
}


// Below function is using Binary search :) IMPLEMENTATION
private fun binarySearchNumber(searchedElement:Int,numbers:MutableList<Int>):Int{
    var low = 0
    var high = numbers.size - 1
    var countSteps = 0
    while (low <= high){
        countSteps ++
        println("Searched Number count is $countSteps")
        val mid = (low + high) / 2
        val cmp = numbers[mid].compareTo(searchedElement)

        if (cmp < 0){
            low = mid + 1
        }else if(cmp > 0){
            high = mid - 1
        }else{
            return numbers[mid]
        }
    }
    return -1
}


// Below function is using linear search :) IMPLEMENTATION
private fun linearSearchNumber(searchedElement:Int,numbers:MutableList<Int>):Int{
    var i =0
    for(number in numbers){
        // It will check every number from the mutablelist which is linear search
        i += 1
        println("Searched numbers is $i")
        if (number == searchedElement){
            return number
        }
    }
    return -1
}