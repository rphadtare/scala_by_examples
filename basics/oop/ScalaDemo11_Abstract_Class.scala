package oop

abstract class Shape {

  private var shapeType = ""

  def this(shape:String) {
    this()
    this.setShapeType(shape)
  }

  def getShapeType() = shapeType

  def setShapeType(shape:String) = shapeType = shape

  def calculateArea() : Float

  def show(): Unit
}

class Circle extends Shape {

  private var radius = 0
  private val pi = 3.14f

  def this(r:Int) {
    this()
    this.setShapeType("Circle")
    this.radius = r
  }

  override def calculateArea(): Float = {
    return pi * radius * radius
  }

  override def show(): Unit = {
    println(s"This is ${this.getShapeType()}")
    println(s"Circle[radius = $radius, area = ${this.calculateArea}]")
    println("-"*25)
  }
}

class Rectangle extends Shape {

  private var length, height = 0.0

  def this(l:Float, h:Float) {
    this()
    this.setShapeType("Rectangle")
    this.length = l
    this.height = h
  }

  override def calculateArea(): Float = {
    return length.toFloat * height.toFloat
  }

  override def show(): Unit = {
    println(s"This is ${this.getShapeType()}")
    println(s"Rectangle[length = $length, height = $height, area = ${this.calculateArea}]")
    println("-"*25)
  }
}

object AbstractDemo {
  def main(args: Array[String]): Unit = {

    val circle = new Circle(5)
    val rectangle = new Rectangle(5, 10)

    val list = List(circle, rectangle)

    for(shape:Shape <- list){
      shape.show()
    }

  }
}