object basics extends App{

def fib(n: Int, a: Int = 0, b: Int = 1): Unit = {
    if(n > 0) {
      println(a)
      fib(n - 1, b, a + b)
    }
  }

fib(10)
}