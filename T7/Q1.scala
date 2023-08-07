object basics extends App{


def filterEvenNumbers(numbers: List[Int]): List[Int] = {
  numbers.filter(number => number % 2 == 0)
}

val test = List(1, 2, 3, 4, 5, 6)
 
println(filterEvenNumbers(test)) 



}