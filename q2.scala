package labsheet8

import scala.io.StdIn

object q2 {

  def main(args: Array[String]) = {
    println("Enter the number: ")
    val num = StdIn.readInt()

    println("--->" + patternMatching(num))
  }

  val patternMatching: Int => String = {
    case x if x < 0 => "Negative Number"
    case x if x == 0 => "Zero"
    case x if x % 2 == 0 => "Even Number"
    case x if x % 2 != 0 => "Odd Number"
  }

}