object basics extends App{


def calculateInterest(deposit: Double): Double = {

//Q1 
    val interestRate = 
      if (deposit <= 20000) 
            0.02
      else if (deposit <= 200000) 
            0.04
      else if (deposit <= 2000000) 
            0.035
      else 
            0.065

    deposit * interestRate
  }

  println(calculateInterest(100000))


//Q2

def identifyNumber(n: Int): String = n match {
    case x if x <= 0 => s"Negative/Zero"
    case x if x % 2 == 0 => s"Even number"
    case x => s"Odd number"
  }

println(identifyNumber(3))


//Q3 

def toUpper(s: String): String = s.toUpperCase

def toLower(s: String): String = s.toLowerCase

def formatNames(name: String)(f: String => String): String = f(name)

val name1 = "Benny"
val name2 = "Niroshan"
val name3 = "Kumara"
val name4 = "Saman"

    println(formatNames(name1)(toUpper))
    println(formatNames(name2.take(2))(toUpper) + formatNames(name2.drop(2))(toLower))
    println(formatNames(name4)(toLower))
    println(name3.dropRight(1) + formatNames(name3.takeRight(1))(toUpper))


}