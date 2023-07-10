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


}


println(isprime(971))
}