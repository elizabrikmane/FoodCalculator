import scala.Int.int2double
import scala.math.BigDecimal.int2bigDecimal
import scala.math.BigInt.int2bigInt

object Trees extends App {
  if (args(0).isEmpty) {
    println(" " + " " + "*")
    println(" " + "*" * 3)
    println("*" * 5)
  }
  else for (i <- 1 to args(0).toInt) {
    print(" " * (args(0).toInt - i))
    println(("*" * i) * 2)
  }
}

