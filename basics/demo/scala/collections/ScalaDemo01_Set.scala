package demo.scala.collections

import scala.collection.immutable.ListSet
import scala.collection.mutable.TreeSet
import scala.collection.mutable.BitSet
import scala.collection.mutable.HashSet


object ScalaDemo01_Set {

  def hashSetDemo(): Unit = {
    var set = Set(10, 2, 3, 4, 2, 3)
    var set1 = Set()
    set += 7
    set -= 3

    println(set)

    for (e <- set) println(e)

    println(set(1))
    println(set.size + "\t" + set1.size)
  }

  def bitSetDemo(): Unit = {
    var bitSet = BitSet(1, 2, 2, 3, 1)
    bitSet += 7

    println(bitSet)

  }

  def listSetDemo(): Unit = {
    var listSet = ListSet(1,2,3)
    listSet += 4

    println(listSet)
    println(listSet.head)
    println(listSet.max)

  }

  def treeSetDemo(): Unit = {
    var treeSet = TreeSet(10,5)
    treeSet ++= List(23, 22, 7, 3, 4)
    println(treeSet)
    treeSet --= List(3, 22)
    println(treeSet)
  }


  def main(args: Array[String]): Unit = {

    treeSetDemo()



  }

}
