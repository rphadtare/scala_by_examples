package oop

abstract class ParentDemo{

  var id = 0
  var name = ""

  def show() = println(s"id: $id and name: $name")

  def getInt() : Int

}

trait Printable{
  def print() : Unit
}

trait Operational {
  def addSquaresOfNum(a:Int, b:Int) : Int
}

class ChildDemo extends ParentDemo with Printable with Operational{

  def this(id:Int, name:String) {
    this()
    this.id = id
    this.name = name
  }

  override def getInt(): Int = 10

  override def print(): Unit = println("This is print function !!")

  override def addSquaresOfNum(a: Int, b: Int): Int = (a*a) + (b*b)

}

object TraitMixinsDemo{

  def main(args: Array[String]): Unit = {

    val c = new ChildDemo(1, "Rohit")
    c.show()
    c.print()
    println(s"Int: ${c.getInt()}")
    println(s"add squares of num 10 and 20: ${c.addSquaresOfNum(10, 20)}")

  }

}