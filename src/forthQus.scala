object forthQus {
  def attendees(ticetPrice: Int): Int = {
    120 + (15 - ticetPrice )/5*20
  }

  def revenue(price: Int): Int ={
    attendees(price)*price
  }

  def cost(price: Int): Int ={
    500 + 3*attendees(price)
  }

  def profit(price: Int): Int ={
    revenue(price) - cost(price)
  }

  def main(args: Array[String]): Unit ={
    println(profit(5), profit(10),profit(15),profit(20),profit(24),profit(25),profit(30))
  }
}
