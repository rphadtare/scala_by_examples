package exceptions.demos

object ScalaDemo02_Finally {

  def main(args: Array[String]): Unit = {

    var str = "R0"

    try{

      var a = str.toInt

    } catch {
      case e: NumberFormatException => {
        println(s"str value is : $str")
        println(e)
      }
    } finally {
        println("This is finally block!!")
      }

    }


}
