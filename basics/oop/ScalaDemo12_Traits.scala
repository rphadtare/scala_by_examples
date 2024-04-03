package oop

trait MyShape{

   private var id : Int = 0
   var shapeName : String

  def getId() = id

  def setId(i:Int) = this.id = i

  def draw() : Unit

}

class CircleShape extends MyShape {

  override var shapeName: String = "Circle"
   def this(id:Int) {
     this()
     super.setId(id)
   }

  override def draw(): Unit = println(s"Drawing $shapeName with id: ${super.getId()}")

}

class RectangleShape extends MyShape {

  override var shapeName: String = "Rectangle"
  def this(id:Int) {
    this()
    super.setId(id)
  }

  override def draw(): Unit = println(s"Drawing $shapeName with id: ${super.getId()}")

}


object TraitDemo{

  def main(args: Array[String]): Unit = {
    val c1 = new CircleShape(1)
    val r1 = new RectangleShape(2)

    val list = List(c1, r1)
    for(shape:MyShape <- list) {
        shape.draw()
    }

  }

}


