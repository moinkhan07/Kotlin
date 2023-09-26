fun main(){

}

// Here how we can inherit multiple class using delegations
class Main:A by FirstDelegate(),B by SecondDelegate(){
    override fun print1() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }
}
interface A{
    fun print1()
}
interface B{
    fun print2()
}

open class FirstDelegate():A{
    override fun print1() {
        TODO("Not yet implemented")
    }

}

open class SecondDelegate():B{
    override fun print2() {
        TODO("Not yet implemented")
    }

}

