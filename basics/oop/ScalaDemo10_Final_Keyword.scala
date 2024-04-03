package oop

final class FinalDemo{

  final var name = "FinalDemo"

  final def displayName() = println(s"Name: $name")

}

object ScalaDemo10_Final_Keyword {

  def main(args: Array[String]): Unit = {
    val obj = new FinalDemo
    obj.displayName()
  }

}
