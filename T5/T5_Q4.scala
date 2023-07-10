object basics extends App{

def isEven(n: Int): Boolean = {
  if (n == 0) true
  else isOdd(n - 1)
}

def isOdd(n: Int): Boolean = {
  if (n == 0) false
  else isEven(n - 1)
}


}