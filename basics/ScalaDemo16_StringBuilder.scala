object ScalaDemo16_StringBuilder {

  def main(args: Array[String]): Unit = {

    var s = new StringBuilder("Rohit")
    //appending string
    s.append("Phadtare not getting Job !!")

    //inserting string at position
    s.insert(0, "Mr. ")
    var index = s.indexOf("Rohit")
    s.replace(index, index+5, "Rohit ")

    index = s.indexOf("not")
    //index+4 - to remove extra white space
    s.delete(index, index+4)

    println(s)

    var x = 12.2672f
    var name = "Pooja"
    var occupation = raw"Civil\Structural Engineer"
    println(s"name: $name and occupation is $occupation")
    println(f"Value of x : $x%2.2f")


  }

}
