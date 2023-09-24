fun main() {
    sayHello()
    sum(10,20)
    println(square(10))
    println(cube(5))
    var mul = multiplication(10,5)
    print("Multiplication is $mul")
    var mulDoubleRes = multiplication(2.5,3.0)
    println("Multiplication with Function overloading is $mulDoubleRes ")
    val sumOfAllNumbers = sumOfNumbers(1,2,3,4,5,6,7,8,9,10)
    println("The sum of all numbers is $sumOfAllNumbers")
}

fun sumOfNumbers(vararg numbers:Int):Int{
    var sumCounter = 0
    for (num in numbers){
        sumCounter = sumCounter + num
    }
    return sumCounter
}

fun sayHello(message:String = message()){  // Default parameter AND also we can pass function as parameter
    println("Hello World and $message")
}

fun message()="Your Welcome"

fun sum(num1:Int,num2:Int){
    println(num1 + num2)
}

fun multiplication(num1:Int,num2:Int) = num1*num2
fun multiplication(num1:Double,num2:Double) = num1*num2 // Function overloading

fun square(n1:Int):Int{
    return n1*n1
}

fun cube(n1:Int):Int{
    return n1*n1*n1
}
