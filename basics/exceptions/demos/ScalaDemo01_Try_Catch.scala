package exceptions.demos
import scala.util.Random
object ScalaDemo01_Try_Catch {

  var num1 = 10
  var num2 = 0

  var arr = Array("Rohit", "Pooja")

  def main(args: Array[String]): Unit = {

    try{

      Random.between(0,2) match {
        case 1 =>
            var result = num1/num2
        case 0 =>
          println(s"Accessing 3rd element from array: ${arr(2)}")
      }


    } catch {
      case e:ArithmeticException =>
        println(s"num2 is $num2")
        println(e)

      case e:ArrayIndexOutOfBoundsException =>
        println(e)
    }


  }


}
