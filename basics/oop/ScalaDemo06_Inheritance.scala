package oop

class Bike(company:String, engine:Int, color:String) {

  def getBikeDetails() = s"company= $company, engine= $engine cc, color= $color"

  def show() = println("show function called!!")

}

class GearBike(company:String, engine:Int, color:String, name:String) extends Bike(company, engine, color){

  def getGearBikeDetails() = {
    super.show()
    s"GearBike[${super.getBikeDetails()}, name = $name ]"
  }

}

object Demo{

  def main(args: Array[String]): Unit = {

    val bike = new GearBike("Honda", 250, "Black", "CBR-250R")
    println(bike.getGearBikeDetails())
  }

}