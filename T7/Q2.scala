object basics extends App{

def calculatesquare(numbers : List[Int]) : List[Int] = {

    numbers.map(number => number * number)
}

val test = List(1,2,3,4,5)
println(calculatesquare(test))
}