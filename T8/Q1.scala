object basics extends App{

 val calculateInterest: Int => Double = {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount => amount * 0.065
  }
  
    val amount = 600000
    
    println(calculateInterest(amount))
  



}