package oop

object ScalaDemo01_SingletonObject {

   val name = "Rohit"
   var last_name = ""

   def functionToDisplay(): Unit = {
    println("This is demo of singleton object!!")
    last_name = "Phadtare"
    println(s"Name : $name and last name : $last_name")

  }

  def main(args : Array[String]): Unit = {
    functionToDisplay()
  }


}
