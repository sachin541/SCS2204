object Q1 extends App {
    val x = new rational(3,4)
    val y = new rational(5,8)
    val z = new rational(2,7)
    val ra4 = x.sub(y)
    val ra5 = ra4.sub(z)
    println(ra5)
   
   
}

class rational(n:Int, d:Int) {
    require(q > 0 , "Q must be positive")
    def p = n/gcd(n.abs, d.abs)
    def q = d/gcd(n.abs, d.abs)
    

    
    def neg = new rational(-this.p, this.q)
    override def toString: String = p + "/" + q

    def sub(that: rational): rational = {
        new rational(
            this.p * that.q - that.p * this.q,
            this.q * that.q
            
        )
    }

}

def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
}