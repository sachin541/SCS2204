class Account(private var balance: Double) {
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


            def transfer(amount: Double, toAccount: Account): Boolean = {
                if (withdraw(amount)) {
                toAccount.deposit(amount)
                true
                } else {
                println("Transfer failed.")
                false
                }
            }

        }
    
object Q3 extends App {
val account1 = new Account(1000)
val account2 = new Account(500)
account1.withdraw(200)
println(account1.getBalance) 
account1.transfer(300, account2)
println(account1.getBalance) 
println(account2.getBalance) 

}

  