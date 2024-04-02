object ScalaDemo05_ForLoop {

  private def simpleForLoop(): Unit = {
    println("Demo simple for Loop with collection")
    val list = List(1, 2, 3, 4)
    for(i <- list){
      println(i)
    }
  }

  private def forLoopWithToKeyWord(): Unit = {
    println("Demo for Loop with 'to' key word")
    for(ele <- 1 to 10){
      println(ele)
    }
  }

  private def forLoopWithUntilKeyWord(): Unit = {
    println("Demo for Loop with 'until' key word")
    for (ele <- 1 until 10) {
      println(ele)
    }
  }

  private def forLoopWithByKeyWord(): Unit = {
    println("Demo for Loop with 'by' key word")
    for (ele <- 10 to 1 by -2) {
      println(ele)
    }
  }

  private def forLoopWithFilter(): Unit = {
    println("Demo for Loop with filter expression")
    val list = List(1, 2, 3, 4, 5)
    for (ele <- list if ele % 2 == 0) {
      println(ele)
    }
  }

  private def foreachLoop(): Unit = {
    println("Demo for each Loop with collection")
    val list = List(1, 2.25, "Rohit", true, 'R')
    list.foreach(
      ele => println(s"element is $ele and type of element is ${ele.getClass}")
    )
  }

  private def forLoopWithYieldKeyWord(): Unit = {
    println("Demo for Loop with 'yield' key word")
    var result = for( ele <- 1 to 5) yield ele
    println(result.getClass)
    result.foreach(println)
  }


  def main(args : Array[String]): Unit = {

    val case_val = "7"

    case_val match {
      case "1" =>
        simpleForLoop()

      case "2" =>
        forLoopWithToKeyWord()

      case "3" =>
        forLoopWithUntilKeyWord()

      case "4" =>
        forLoopWithByKeyWord()

      case "5" =>
        forLoopWithFilter()

      case "6" =>
        foreachLoop()

      case "7" =>
        forLoopWithYieldKeyWord()

      case _ =>
        println("This is default case")

    }


  }


}
