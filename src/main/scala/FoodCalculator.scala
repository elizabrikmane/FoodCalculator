object FoodCalculator extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20

  val cost = price*quantity

  println(s"It costs $cost to buy $quantity kilos of $food.")
}
