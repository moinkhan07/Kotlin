fun main() {
//    val cal1 = Calculator()
//    var res1 = cal1.sum(10,10)
//    println("Sum is $res1")
    var res1 = Calculator.sum(10,5)
    var maxVal = Calculator.max
    print("Max Value is $maxVal")
    println("Sum is $res1")
}

                                  // Companion Object  :
class Calculator(){
     // The code under the Companion Object body can be directly access with the class name
    // and not with thw class object
    companion object{
        var max = 55
       fun sum(a:Int,b:Int):Int{
        return a + b
       }
    }
}