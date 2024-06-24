object Main {
  def main(args: Array[String]): Unit ={
    var i,j,k = 2
    var m,n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    val expr1 = k + 12 * m
    val expr2 = m.toFloat / j
    val expr3 = n % j
    val expr4 = m.toFloat / j * j
    val expr5 = f + 10 * 5 + g
    i += 1
    val expr6 = i * n


    println(s"a) k + 12 * m = $expr1")
    println(s"b) m / j = $expr2")
    println(s"c) n % j = $expr3")
    println(s"d) m / j * j = $expr4")
    println(s"e) f + 10 * 5 + g = $expr5")
    println(s"f) ++i * n = $expr6")
  }
}
