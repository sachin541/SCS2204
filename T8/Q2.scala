object basics extends App{

val classifyNumber: Int => String = num => num match {
    case n if n < 0 => "Negative is input"
    case n if n == 0 => "Zero is input"
    case n if n % 2 == 0 => "Positive Even number is given"
    case _ => "Positive Odd number is given"
  }

val a = scala.io.StdIn.readInt()
println(classifyNumber(a))




}