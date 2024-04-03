package oop

class Language {

  private var typeOfLanguage = ""

  def setTypeOfLanguage(new_val : String): Unit = {
    this.typeOfLanguage = new_val
  }

  def getTypeOfLanguage() : String = {
    this.typeOfLanguage
  }


}

case class OOP(name:String) extends Language

object ScalaDemo04_CaseClass_Inheritance {
  def main(args : Array[String]): Unit = {
    val scalaObj = OOP("Scala")
    scalaObj.setTypeOfLanguage("OOP")
    println(s"Object is type of : ${scalaObj.getClass}")
    println(s"Details of object are - OOP[Name - ${scalaObj.name}, Type = ${scalaObj.getTypeOfLanguage()}]")
    println("-"*25)

  }


}

