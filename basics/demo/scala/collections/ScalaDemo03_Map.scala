package demo.scala.collections

import scala.collection.mutable
import scala.collection.mutable.{HashMap, Map}

object ScalaDemo03_Map {

  def mapDemo(): Unit = {

    var map = Map((1,"Rohit"), (2,"Pooja"))
    var map1 = Map((4,"Rushi"), (5,"Rutu"))

    map += (3 -> "Rajani")
    map -= (1)

    //merging
    map = map ++ map1

    println(map)

    for((k,v) <- map) {
      println(s"Key: ${k} and value: $v")
    }

  }

  def main(args: Array[String]): Unit = {
    mapDemo()
  }

}
