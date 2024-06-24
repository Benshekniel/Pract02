object thrQus {

  def calculateGrossSalary(normalHours: Int, otHours: Int): Double = {
    val normalRate = 250
    val otRate = 85
    (normalHours * normalRate) + (otHours * otRate)
  }

  // Function to calculate the tax amount
  def calculateTax(grossSalary: Double, taxRate: Double): Double = {
    grossSalary * taxRate
  }

  // Function to calculate the net salary
  def calculateNetSalary(normalHours: Int, otHours: Int, taxRate: Double): Double = {
    val grossSalary = calculateGrossSalary(normalHours, otHours)
    val taxAmount = calculateTax(grossSalary, taxRate)
    grossSalary - taxAmount
  }

  def main(args: Array[String]): Unit = {
    val normalHours = 40
    val otHours = 30
    val taxRate = 0.12

    val netSalary = calculateNetSalary(normalHours, otHours, taxRate)
    println(s"Take-home salary: Rs. $netSalary")
  }
}
