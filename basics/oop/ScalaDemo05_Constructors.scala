package oop

class MyStudent(id:Int, name:String){

  var school_name, std = ""
  println()
  print("Called default constructor -> ")

  def this(id:Int, name:String, school_name:String){
    this(id, name)
    this.school_name = school_name
    print("Called secondary constructor with three parameters ->")
  }

  def this(id:Int, name:String, school_name:String, std:String){
    this(id, name, school_name)
    this.std = std
    print("Called secondary constructor with four parameters ->")
  }

  override def toString: String = {
    s"Student[id = $id, name=$name, school name = $school_name, std = $std]"
  }


}

object ScalaDemo05_Constructors {

  def main(args: Array[String]): Unit = {
    val s = new MyStudent(1, "Rohit")
    val s1 = new MyStudent(1, "Rohit", "Modern High School")
    val s2 = new MyStudent(1, "Rohit", "Modern High School", "10th")
    println()
    List(s, s1, s2).foreach(ele => println(ele + "\n" + "--"*25))


  }


}