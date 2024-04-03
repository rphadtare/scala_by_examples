package oop

class MethodOverloadingDemo {

  def show(msg:String): Unit = {
    println(msg)
  }

  def show(msg:String, sep:Char): Unit = {
    println(msg)
    println(s"$sep"*50)
  }

}

class Operation{

  def add(a:Int, b:Int) = a + b
  def add(a:Float, b:Float) = a + b

}

object ScalaDemo05_MethodOverloading {


  def main(args: Array[String]): Unit = {
    val m = new MethodOverloadingDemo
    m.show("This is original show method!!")
    m.show("This is overloaded method !!", '-')

    val op = new Operation
    println(s"Addition of 10 and 20 : ${op.add(10,20)}")
    println(s"Addition of 10.23 and 20.77 : ${op.add(10.23f, 20.77f)}")

  }

}
