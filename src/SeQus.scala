object SeQus {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 0

    b -= 1
    println(s"a) println( - -b * a + c *d - -) is ${b*a+c*d}")
    d -= 1

    println(s"b) println(a++) is ${a}")
    a += 1

    println(s"c) println (–2 * ( g – k ) +c) is ${-2 * (g - k ) + c}")

    c += 1
    println(s"d) println (c=c++) is ${c}")

    c += 1
    println(s"e)  println (c=++c*a++) is ${c*a}")
    a += 1
  }

}
