package exceptions.demos

object ScalaDemo03_Throw {

  def main(args: Array[String]): Unit = {

    try{

      var num1 = 10
      var num2 = 0
      var result = 0


      if(num2 == 0){
        throw new ArithmeticException(s"Value of num2 is $num2. Hence, division by zero operation is not allowed!!")
      } else {
        result = num1/num2
      }

    } catch {
      case e:ArithmeticException => println(e)
    }


  }


}
