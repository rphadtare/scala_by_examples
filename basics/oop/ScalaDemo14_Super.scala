package oop

class ParentClass {

  private var id = 0
  private var name = ""

  def setId(i:Int) = this.id = i
  def setName(name:String) = this.name = name
  def getDetails = s"id: $id, name: $name"

}

class ChildClass extends ParentClass {

  private var mobile = ""

  def this(id:Int, name:String, mobile:String) {
    this()
    super.setId(id)
    super.setName(name)
    this.mobile = mobile
  }

  override def getDetails: String = s"${super.getDetails}, mobile: $mobile"

}

object ScalaDemo14_Super {

  def main(args: Array[String]): Unit = {
      val c = new ChildClass(1, "Rohit", "779141804")
      println(c.getDetails)
  }

}
