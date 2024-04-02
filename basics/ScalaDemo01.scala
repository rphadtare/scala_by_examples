object ScalaDemo01 {

  private def sampleFunction(): String = {
    "This is example of function programming"
  }

  def main(args : Array[String]): Unit = {
    println("This is scala Demo !!")
    println(s"Result of sampleFunction : $sampleFunction")

  }

}
