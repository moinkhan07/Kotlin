fun main(){
    val person1 = Bank("Moin")
    person1.deposit(5000)
    person1.withdraw(1000)
    person1.deposit(12)
    person1.withdraw(1000)
    person1.getListOfTransactions()
    person1.accountBalance()
}

class Bank(var accountName:String){
    var balance = 0
    var transactions = mutableListOf<String>()

    fun deposit(depositAmount:Int){
        if (depositAmount > 0) {
            this.balance = this.balance + depositAmount
            transactions.add("Deposited $depositAmount")
            println("Deposited ${depositAmount} Successfully!")
        }else{
            println("Deposit Amount Should be not more than 0")
        }
    }

    fun withdraw(withdrawAmount: Int){
        if (withdrawAmount <= this.balance){
            this.balance = this.balance - withdrawAmount
            transactions.add("Withdrawl ${withdrawAmount}")
            println("Withdrawn ${withdrawAmount} Successfully!")
        }else{
            println("Insufficient Balance!,Your Balance is ${this.balance}")
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