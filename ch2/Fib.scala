object Fib {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def iter(x: Int, a: Int, b: Int): Int = x match {
      case x if x >= n  => a
      case _ => iter(x + 1, b, a + b)
    }
    iter(1, 0, 1)
  }

  def main(args: Array[String]) = {
   assert(fib(1) == 0, "the first number should be 0")
   assert(fib(3) == 1, "the third number should be 1")
  }
}
