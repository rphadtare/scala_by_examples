import scala.language.postfixOps

object ScalaDemo05_WhileLoop {

  def main(args : Array[String]): Unit = {

    println("While loop demo ...")
    var ele = 1
    while (ele < 5){
      println(s"Element value is $ele")
      ele += 1
    }
    println("--"*10)

    println("Do While loop demo ...")
    ele = 1
    do{
      println(s"Element value is $ele")
      ele += 2
    } while (ele < 10)
    println("--"*10)


  }

}
