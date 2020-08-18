import GCD.i

import scala.Int.int2double
import scala.math.BigDecimal.int2bigDecimal
import scala.math.BigInt.int2bigInt

object Trees extends App {
  var myDefault = 3
  if (args.length > 0) {
    println(s"We got ${args.length} arguments")
    myDefault = args(0).toInt
  } else
    println("We got nothing; we will use the default value")

  println(s"My default value is $myDefault")

  for (i <- 1 to myDefault) {
    print(" " * (myDefault - i))
  println(("*" * i) * 2) }
}





