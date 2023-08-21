class Accounts(private var balance: Double) {
    def getBalance: Double = balance

    def deposit(amount: Double): Unit = {
        if (amount > 0) {
        balance = amount + balance
        } else {
        println("deposit > 0")
        }
    }

    def withdraw(amount: Double): Boolean = {
        if (amount > 0 && amount <= balance) {
        balance = balance - amount
        true
        } else {
        println("no funds")
        false
        }
    }


    def transfer(amount: Double, toAccount: Accounts): Boolean = {
        if (withdraw(amount)) {
        toAccount.deposit(amount)
        true
        } else {
        println("Transfer failed.")
        false
        }
    }



    //Q4
    def applyInterest(): Unit = {
        if (balance > 0) {
            balance = balance + (balance * 0.05)  
        } else {
            balance = balance + (balance * 0.1)   
        }
    }

}


class Bank(accounts: List[Accounts]) {

   
    def negativeBalances: List[Accounts] = {
    accounts.filter(account => account.getBalance < 0)
    }

    def totalBalance: Double = {
        accounts.map(account => account.getBalance).sum
    }

    def applyInterestToAll(): Unit = {
        accounts.foreach(account => account.applyInterest())
    }
}



    
object Q4 extends App {



    val account1 = new Accounts(1000)
    val account2 = new Accounts(-500)
    val account3 = new Accounts(2000)
    val account4 = new Accounts(-150)
    val account5 = new Accounts(5000)
    val account6 = new Accounts(1000)
    val account7 = new Accounts(9000)

    val bank = new Bank(List(account1, account2, account3, account4 , account5, account6, account7))

    println("Accounts with negative balances:")

    for (account <- bank.negativeBalances) {
    println(account.getBalance)

    }


    println("Total balance in the bank: " + bank.totalBalance )

    bank.applyInterestToAll()
    
    for (account <- List(account1, account2, account3, account4, account5, account6, account7)) {
    println(account.getBalance)
}
}