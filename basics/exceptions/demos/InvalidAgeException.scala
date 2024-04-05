package exceptions.demos

class InvalidAgeException extends Exception {

  private var exceptionMsg = ""

  def this(e:String){
    this()
    this.exceptionMsg = e
  }

  override def toString() = s"InvalidAgeException: Age should be > 18. $exceptionMsg"

}

object InvalidAgeException {

  def validateAge(age:Int) : Boolean = {
    if(age > 18) true else false
  }

  def main(args: Array[String]): Unit = {

    try {
      var age = 17
      if(!validateAge(age)){
        throw new InvalidAgeException(s"Given age is : $age")
      } else {
        println("Hurray ! Age validated successfully !!")
      }
    } catch {
      case e:InvalidAgeException => {
        println("Age validation failed !!")
        println(e)
      }
    }

  }

}
