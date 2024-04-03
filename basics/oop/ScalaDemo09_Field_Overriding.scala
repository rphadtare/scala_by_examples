package oop

class A1 {

  val name = "A1"
  var a1_id = 0

  def this(id:Int) {
    this()
    this.a1_id = id
  }

  def show(): Unit = {
    println(s"name: $name and id: $a1_id")
  }
}

class B1 extends A1 {

  override val name: String = "B1"
  var b1_id = 0

  def this(a1_id:Int, b1_id: Int) {
    this()
    this.a1_id = a1_id
    this.b1_id = b1_id
  }

  override def show(): Unit = {
    println(s"name: $name and A1 Id: $a1_id and B1 Id: $b1_id")
  }


}

object FieldOverrideDemo{

  def main(args: Array[String]): Unit = {
    val b = new B1(1,2)
    b.show()
  }

}
