fun main(){
    val num :Int = 20 //Val cannot be changed it is "IMMUTABLE"
//    num = 11 (Val cannot be reassigned)
    val minIntegerNum :Int = Int.MIN_VALUE // This is optional :Int
    val maxIntegerNum = Int.MAX_VALUE

    println("Min Integer is: $minIntegerNum") // -2147483648
    println("Max Integer is: $maxIntegerNum") // 2147483647
//    We cannot access more than 2147483647 & less than -2147483648 in INT
//    else it will give us error
//    To access more than this numbers we can use Long Data type

//    For Byte the range is :
    val minByteValue = Byte.MIN_VALUE
    val maxByteValue = Byte.MAX_VALUE

    println("Min Byte Value is: $minByteValue") // -128
    println("Max Byte Value is: $maxByteValue") // 127

//    For Short the range is :
    val minShortValue = Short.MIN_VALUE
    val maxShortValue = Short.MAX_VALUE

    println("Min Short Value is: $minShortValue") // -32768
    println("Max Short Value is: $maxShortValue") // 32767

//    For Long the range is :
    val minLongValue = Long.MIN_VALUE
    val maxLongValue = Long.MAX_VALUE

    println("Min Long Value is: $minLongValue") // -9223372036854775808
    println("Max Long Value is: $maxLongValue") // 9223372036854775807
}
