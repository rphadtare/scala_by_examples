package oop

class HondaBike {
  private var honda_bike_name = ""
  private var honda_bike_engine = 0
  private var honda_bike_color = ""
  private var engine_flag = 0

  def this(name:String, engine:Int, color:String) {
    this()
    this.honda_bike_name = name
    this.honda_bike_engine = engine
    this.honda_bike_color = color
  }

  def setHondaBikeDetails(name: String, engine: Int, color: String) :Unit = {
    this.honda_bike_name = name
    this.honda_bike_engine = engine
    this.honda_bike_color = color
  }

  def engineStart(): Unit = {
    println("Engine started !!")
    engine_flag = 1
  }
  def engineStop(): Unit = {
    println("Engine stopped !!")
    engine_flag = 0
  }

  def getEngineState() = if(engine_flag == 1) true else false

  def getHondaBikeDetails = s"bike name= $honda_bike_name, engine= $honda_bike_engine, color= $honda_bike_color"
}

class HondaGearBike(gear_num:Int) extends HondaBike {

  private var speed = 0
  private var current_gear = 0
  def this(name:String, engine:Int, color:String, gear_num:Int) {
    this(gear_num)
    this.setHondaBikeDetails(name, engine, color)
  }

  def getSpeed() = speed
  def setSpeed(given_speed:Int) = this.speed = given_speed

  def getCurrentGear() = current_gear

  def gearUp():Unit = {
    if (this.getEngineState) {
      this.current_gear += 1

      this.current_gear match {
        case 1 =>
          this.setSpeed(10)
        case 2 =>
          this.setSpeed(20)
        case 3 =>
          this.setSpeed(40)
        case 4 =>
          this.setSpeed(60)
        case 5 =>
          this.setSpeed(100)
      }

    } else {
      println("Please start engine first!!")
    }
  }

  def gearDown(): Unit = {
    if (this.getEngineState) {
      this.current_gear -= 1
      this.current_gear match {
        case 0 =>
          this.setSpeed(0)
        case 1 =>
          this.setSpeed(10)
        case 2 =>
          this.setSpeed(20)
        case 3 =>
          this.setSpeed(40)
        case 4 =>
          this.setSpeed(60)
      }

    } else {
      println("Please start engine first!!")
    }
  }

  def getHondaGearBikeDetails = s"HondaGearBike[${this.getHondaBikeDetails}, number of gears: $gear_num]"

  def getCurrentState = s"Bike is running on $current_gear gear and speed is $speed"

}

object Demo1{
  def main(args: Array[String]): Unit = {
    val bike = new HondaGearBike(name = "CBR", engine = 250, color = "Red", gear_num = 5)
    println(bike.getHondaGearBikeDetails)

    bike.engineStart()

    for(gear <- 1 to 5) {
      bike.gearUp()
      println(bike.getCurrentState)
    }

    for (gear <- 5 to 1 by -1) {
      bike.gearDown()
      println(bike.getCurrentState)
    }
    bike.engineStop()

  }
}