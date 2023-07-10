object basics extends App{

def sumEven(n: Int): Int = {
  if (n <= 0) 0
  else if (n % 2 == 0) 
    n + sumEven(n - 2)
  else sumEven(n - 1)
}

def sum(n:Int):Int = {
    if(n%2 == 0)
    sumEven(n) - n
    else 
    sumEven(n) 

}

println(sum(10))
}