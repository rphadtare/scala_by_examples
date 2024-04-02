object ScalaDemo06_Functions {

  private def functionExample() {
    println("This is function sub routine demo!!")
    println("-"*25)
  }

  private def functionWithParam(a:Int, b:Int): Unit = {
    println("This is function with parameter demo!!")
    println(s"parameters are a:$a and b:$b")
    println("-"*25)
  }

  private def functionWithDefaultParam(a: Int, b: Int = 5): Unit = {
    println("This is function with default parameter demo!!")
    println(s"parameters are a:$a and b:$b")
    println("-" * 25)
  }

  private def functionWithNamedParam(first_name:String, last_name:String): Unit = {
    println("This is function with named parameter demo!!")
    println(s"First name: $first_name and Family name: $last_name")
    println("-" * 25)
  }

  def main(args : Array[String]): Unit = {
      functionExample()
    functionWithParam(10,20)
    functionWithDefaultParam(22)
    functionWithNamedParam(last_name = "Phadtare", first_name = "Rohit")
  }




}
