fun main(){
    val person1 = Bank("Moin")
    person1.deposit(5000)
    person1.withdraw(1000)
    person1.getListOfTransactions()
}

class Bank(var accountName:String){
    var balance = 0
    var transactions = mutableListOf<String>()

    fun deposit(depositAmount:Int):String{
        if (depositAmount > 0) {
            this.balance = this.balance + depositAmount
        }
        transactions.add("Deposited $depositAmount")
        return "Deposited ${depositAmount} Successfully!"
    }

    fun withdraw(withdrawAmount: Int):String{
        if (withdrawAmount <= this.balance){
            this.balance = this.balance - withdrawAmount
            transactions.add("Withdrawl ${withdrawAmount}")
            return "Withdrawn ${withdrawAmount} Successfully!"
        }else{
            println("Insufficient Balance!")
            return ""
        }
    }

    fun accountBalance(){
        println("Your Bank Balance is ${this.balance}")
    }

    fun getListOfTransactions(){
        for (i in transactions){
            println(i)
        }
    }

}