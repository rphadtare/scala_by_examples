import scala.util.control.Breaks.{break, breakable}

object ScalaDemo05_BreakAndContinue_Statements {

  def main(args : Array[String]): Unit = {

    println("Below is demo for break statement in scala")
    breakable {
      for (ele <- 1 to 10) {
        if (ele == 5) {
          break
        }
        println(ele)
      }
    }
    println("--"*10)

    println("Below is demo for continue statement in scala with use of break and breakable statements")

    for (ele <- 1 to 10) {
      breakable {
        if (ele == 5) {
          println("Skipping current iteration !!")
          break
        } else {
          println(ele)
        }
      }

    }

    println("--" * 10)

  }

}
