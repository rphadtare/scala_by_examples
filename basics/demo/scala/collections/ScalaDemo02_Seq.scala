package demo.scala.collections

import java.util.stream
import scala.::
import scala.collection.mutable.ListBuffer
import scala.reflect.ClassTag

object ScalaDemo02_Seq {

  def seqDemo(): Unit = {
    var seq = Seq(1,2,3,4,4)
    println(seq)
    println("Sorted: " + seq.sorted)
    println(seq(3))
    println("Reverse Sorted: " + seq.sortBy(e => -e))
    println("Reverse : " + seq.reverse)
  }

  def vectorDemo(): Unit = {

    var vector = Vector(1, 2, 3, 4, 5)
    vector :+= 6
    vector = vector.union(List(7,8))
    //in 2.13 - vector.appendAll(List(7,8)) or vector:++List(7,8)

    vector = vector.filter(r => r!=4)

    println(vector)
  }

  def listDemo(): Unit = {
    var list = List(1,2,3,3,4,5)
    list = list :+ 6
    list = list.filter(e => !Seq(2,3,4).contains(e))
    println(list)
  }

  def listBufferDemo(): Unit = {
    var listBuffer = ListBuffer(1,2,3,4,6,6)
    listBuffer += 7
    //in scala 2.13 - listBuffer.addOne(9)
    listBuffer --= List(2,4)
    listBuffer(0) = 10
    println(listBuffer)
  }
  
  def main(args: Array[String]): Unit = {
    vectorDemo()
  }

}
