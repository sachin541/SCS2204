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

def primeseq(n:Int ): Unit = {

    if(n > 2){
        primeseq(n-1)
        if(isprime(n-1))
           { 
            print(n-1) 
            print(" ") 

           }

    }

}


primeseq(10)
}