object GCD extends App {
  var i = 0
  while (i < 10) {
    println(i)
    i+=1
  }
  println(s"1 is $i")
  var sum = 0.toLong
  i = 0
  val max = 1000000000.toLong
  while (i <= max) {
    sum += i // add whatever i is at the time of sum
    i+= 1 // add 1 to iterator
  }
  println(s"Sum of numbers up to and including $max is $sum")


  // do while loops are rare because they do something and only then check
  i = 50
  do {
    println(s"i is $i")
    i -= 1
  } while (i > 45)

  def gcdLoop(x: Long, y: Long):Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temporary = a //we save a since we are going to mutate this a
      a = b % a // new a is now whatever remains when we divide b by a
      b = temporary // move old a to b
    }
    b
  }
  println(gcdLoop(15,10))

}
