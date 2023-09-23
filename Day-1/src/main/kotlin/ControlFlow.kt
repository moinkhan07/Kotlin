fun main(){
    val num = 5
    when(num){
//        100 -> println("Your num value is $num")
//        101 -> println("Your num value is $num")
//        102 -> println("Your num value is $num")
//        103 -> println("Your num value is $num")
//        We can write the above 4 line like this:
        100,101,102,103 ->{ // we can use curly braces when we have more than one line of body
            println("Your num value is $num")
        }
        in 1..10 -> println("Your num is between 1 to 10.") // In range we can find like this

        else -> println("Your num is $num (else block)")
    }
//    Another way to write this:
    when{
       num == 100 ->{ // we can use curly braces when we have more than one line of body
            println("Your num value is $num")
        }
        num >= 0 || num <= 10 -> println("Your num is between 1 to 10.") // In range we can find like this

        else -> println("Your num is $num (else block)")
    }

}