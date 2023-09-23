fun main(){
    var age = 15

    if (age >= 18){
        println("You can vote!")
    }else{
        println("Sorry, You are not eligible!")
    }

    var isValidToMakePassport = true
    var gender = "female"
    if (isValidToMakePassport && (gender == "male" || gender == "female")){
        println("You are eligible!")
    }else{
        println("Not eligible!")
    }
}