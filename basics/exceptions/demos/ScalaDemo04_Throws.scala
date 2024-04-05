package exceptions.demos

import exceptions.demos

import scala.util.Random

object ScalaDemo04_Throws {

  var num = ""
  @throws(classOf[NullPointerException])
  @throws(classOf[NumberFormatException])
  def validate(str:String) = if(str == null) throw new NullPointerException("Given string is null!!") else str.toInt
  def main(args: Array[String]): Unit = {

    Random.between(0,2) match {
      case 0 => num = "R0"
      case 1 => num = null
    }

    try {
      validate(num)
    } catch {
      case e:NullPointerException => {
        println(e)
      }

      case e:NumberFormatException => {
        println(s"Given string is invalid $num")
        println(e)
      }

    }


  }




}
