package oop

class ScalaDemo02_Companion(id:Int, name:String){

  def show(): Unit = {
    println(s"Companion class name : ${this.getClass.getName}")
    println(s"Companion Object Details are - [id = $id, name = $name]")
  }

}

object ScalaDemo02_Companion {

  def main(args : Array[String]): Unit = {

    println("This is demo of companion object!!")
    println(s"Companion object name : ${this.getClass.getName}")

    val obj = new ScalaDemo02_Companion(10, "Rohit")
    obj.show()
    println("-"*25)

  }

}
