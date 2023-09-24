import kotlin.math.max
import kotlin.math.min

fun main(){
//   var names = arrayOf("moin","abdul","zeeshan","saqlain","vivek")
//    var multiData = arrayOf("Moin","Abdul",'Z',1,true)
//    var i = 0
//    while (i < names.size){
//        println(names[i])
//        i++
//    }
//    for (i in names){
//        println(i)
//    }
    var minimumNumberInTheArray = arrayOf(102,45,32,78,98,15,87)
    var maximumNumberInTheArray = arrayOf(102,45,32,78,98,15,87)
    var minRes = minNumberInAnArray(minimumNumberInTheArray)
    var maxRes =  maxNumberInAnArray(maximumNumberInTheArray)
    println("The minimum number in the array is $minRes")
    println("The maximum number in the array is $maxRes")
}

fun minNumberInAnArray(arr:Array<Int>):Int{
    var minNum = Int.MIN_VALUE
    for(i in arr){
        if (minNum < i){
            minNum = i
        }
    }
    return minNum
}
fun maxNumberInAnArray(arr:Array<Int>):Int{
    var maxNum = Int.MAX_VALUE
    for(i in arr){
        if (maxNum > i){
            maxNum = i
        }
    }
    return maxNum
}