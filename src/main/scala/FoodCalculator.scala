object FoodCalculator extends App {
  var food = "potatoes"
  var price = 0.37
  var quantity = 20
  var myVar = 50

  println(s"We got ${args.length} arguments")
  // if (!args.isEmpty)
  if (args.length >= 3) {
    price = args(0).toFloat
    quantity = args(1).toInt
    food = args(2)
  }
  println(s"The first argument is ${args(0)}")
  println(s"The second argument is ${args(1)}")
  println(s"The third argument is ${args(2)}")

  myVar += 100
  myVar += 100

  val cost = price*quantity

  println(s"It will cost $cost euros to buy ${args(1)} kilos of ${args(2)}")



}

