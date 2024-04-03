package oop

trait Human
case object Person extends Human
case class Student(id:Int, name:String) extends Human
case class Employee(id:Int, name:String, org_name:String) extends Human

object ScalaDemo03_CaseClass_CaseObject {

  private def getMessageFrom(obj : Human) = obj match {
    case Person => s"This is person !!"
    case Student(id,name) => s"This is student[id = $id, name=$name]"
    case Employee(id,name,org_name) => s"This is Employee[id = $id, name=$name, org_name=$org_name]"
  }

  def main(args : Array[String]): Unit = {

    println(getMessageFrom(Person))
    println(getMessageFrom(Student(1,"Rohit")))
    println(getMessageFrom(Employee(1, "Rohit", "Wipro Ltd")))

  }

}
