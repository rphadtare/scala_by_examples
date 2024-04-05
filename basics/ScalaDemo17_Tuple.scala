object ScalaDemo17_Tuple {

  def main(args: Array[String]): Unit = {

    var t = (1, "Rohit", 2000)
    println(t)

    t.productIterator.foreach(println)
    println(t._2)

  }

}
