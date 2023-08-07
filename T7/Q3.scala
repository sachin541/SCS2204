object basics extends App{

def isprime(number: Int , i:Int=2): Boolean = {

    if(number < 2)
    false
    else if(number == 2)
    true 
    else if(number == i)
    true 
    else if(number%i == 0)
    false
    else 
    isprime(number , i+1)


} //from tutorial 5 

def filterPrime(numbers: List[Int]): List[Int] = {
  numbers.filter(number => isprime(number))
}

val test = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
println(filterPrime(test))
}