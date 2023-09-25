fun main(){
//    for (direction in Directions.values()){
//        println(direction.direction +" "+direction.distance +" "+direction.name)
//    }
//    Directions.NORTH.printData()
    var direction = Directions.NORTH
    when(direction){
        Directions.EAST -> println("The Direction is East")
        Directions.WEST -> println("The Direction is West")
        Directions.NORTH -> println("The Direction is North")
        Directions.SOUTH -> println("The Direction is South")
    }
}

enum class Directions(var direction:String,var distance:Int){
    NORTH("North",12),
    SOUTH("South",22),
    EAST("East",6),
    WEST("West",16);

    fun printData(){
        println("Direction: $direction and Distance: $distance")
    }
}