import scala.annotation.tailrec

object Fibonacci extends App {
  def fib(n: Int): Int = {
    @tailrec
    def fibHelper(n: Int, pp: Int, p: Int): Int = {
      if (n == 0) pp
      else if (n == 1) p
      else fibHelper(n - 1, p, pp + p)
    }
    fibHelper(n, 0, 1)
  }


  // Example usage:
  println(fib(0)) // Output: 0
  println(fib(1)) // Output: 1
  println(fib(5)) // Output: 5
  println(fib(10)) // Output: 55
  println(fib(20)) // Output: 6765
}
