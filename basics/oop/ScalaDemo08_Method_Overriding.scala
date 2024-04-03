package oop

class Animal {

  var animal_name = ""
  var animal_type = ""

  def this(name:String, animal_type:String) {
    this()
    this.animal_name = name
    this.animal_type = animal_type
  }

  def show(): Unit = {
    println(s"Animal name is $animal_name and animal type is $animal_type")
  }

}

class Dog extends Animal {
  var age = 0

  def this(name:String, age:Int) {
    this()
    this.animal_name = name
    this.animal_type = "DOG"
    this.age = age
  }

  override def show(): Unit = {
    println(s"This is $animal_type. Name is $animal_name and age is $age years")
  }

}

class Cat extends Animal {
  var age = 0

  def this(name:String, age:Int) {
    this()
    this.animal_name = name
    this.animal_type = "CAT"
    this.age = age
  }

  override def show(): Unit = {
    println(s"This is $animal_type. Name is $animal_name and age is $age years")
  }

}

object MethodOverridingDemo{
  def main(args: Array[String]): Unit = {

    val list = {
      List(new Dog("Dash", 5), new Cat("Monika", 2))
    }

    for(a:Animal <- list) {
      a.show()
    }

  }
}