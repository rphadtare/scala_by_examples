object ScalaDemo02_Variables {

  def varDemo(): Unit = {
    var name = "Rohit"
    println(s"name is $name")
    println("update name variable to 'Pooja'")
    name = "Pooja"
    println(s"name is $name")
  }

  def valDemo(): Unit = {
    val cnt = 10
    println(s"Value of cnt : $cnt")
  }

  def explicitDataTypeDemo(): Unit = {
    val random_float : Float = 10.23f
    println(s"Value of random float : $random_float")

  }

  def exampleOfAny(): Unit = {
    val list = List(1, 2.2, 'A', "Rohit", true)
    list.foreach(println)
  }

  def main(args : Array[String]): Unit = {
      varDemo()
      valDemo()
      explicitDataTypeDemo()
      exampleOfAny()

  }

}
