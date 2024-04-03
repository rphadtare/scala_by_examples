package oop

class Parent{
  var id = 0
  var family_name = ""

  def this(id:Int, name:String) {
    this()
    this.id = id
    this.family_name = name
  }

 def getParentDetails = s"id= ${this.id}, family name= ${this.family_name}"
}

class Child1 extends Parent{

  var child1_name = ""
  val gender = "Male"

  def this (id:Int, name:String, child1_name:String) {
    this()
    this.id = id
    this.family_name = name
    this.child1_name = child1_name
  }

  def getDetails = s"Child1[${this.getParentDetails}, first name: $child1_name, gender = $gender]"

}


class Child2 extends Parent{

  var child2_name = ""
  val gender = "Female"

  def this (id:Int, name:String, child2_name:String) {
    this()
    this.id = id
    this.family_name = name
    this.child2_name = child2_name
  }

  def getDetails = s"Child2[${this.getParentDetails}, first name: $child2_name, gender = $gender]"

}

object InheritanceDemo{

  def main(args: Array[String]): Unit = {
    val m = new Child1(1, "Phadtare", "Rohit")
    val f = new Child2(2, "Phadtare", "Pooja")

    println(s"Object : ${m.getDetails}")
    println(s"Object : ${f.getDetails}")

  }

}