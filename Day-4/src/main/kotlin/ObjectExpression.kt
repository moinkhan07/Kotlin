fun main(){
    // We had created onclickfunction particular for every button (Using Object Expression)
    val loginBtn = ButtonInfo("Login",123, object: OnClickListener {
        override fun onClick() {
            println("Login Button Clicked!")
        }

    })

    val signUpBtn = ButtonInfo("SignUp",1234, object :OnClickListener{
        override fun onClick() {
            println("SignUp Button Clicked!")
        }

    })
}

interface OnClickListener{
    fun onClick()
}
//class ClickListener():OnClickListener{
//    override fun onClick() {
//
//    }
//
//}
class ButtonInfo(val text:String,val id:Int,onClickListener: OnClickListener){
    fun showButtonDetails(){
        println("Text: $text with the id: $id")
    }
}