object ScalaDemo07_HigherOrderFunction {

  private def squareOfInt(a:Int) = a * a
  private def addOneToInt(a:Int) = a + 1

  private def higher_order_fun1(a:Int, f:Int => Int) : Int = {
    println("This is demo of function with parameter which is receiving another function !!")
    println(s"Received param values a : $a and f: $f")
    f(a)
  }

  private def higher_order_fun_composition(): Unit = {
    println("This is demo of function composition !!")
    println("Passing value 10 to function composition : squareOfInt(addOneToInt(10))")
    println(s"Result is ${squareOfInt(addOneToInt(10))}")
    println("-"*50)
  }

  private def find_lowest_number(num1:Int, num2:Int, num3:Int): Unit = {
    println("This is demo of nested function !!")

    def find_lowest_of_two_int(num1:Int, num2:Int) : Int = {
      if (num1 > num2) num2 else num1
    }

    println(s"Received numbers are $num1, $num2, and $num3")
    println(s"Lowest of given number is ${find_lowest_of_two_int(num1, find_lowest_of_two_int(num2, num3))}  ")
    println("_"*50)

  }

  private def variable_length_argument_func( a: Any*): Unit = {
    println("This is demo of variable arguments function !!")

    var cnt = 1
    for(ele <- a){
      println(s"parameter at position $cnt is $ele")
      cnt += 1
    }

    println("-"*50)

  }


  def main(args : Array[String]): Unit = {

    val result = higher_order_fun1(10, squareOfInt)
    println(s"Result is : $result")
    println("-"*50)

    higher_order_fun_composition()

    val addTwoInt = (a: Int, b:Int) => a + b
    println(s"Demo of lambda function with '=>' addTwoInt : ${addTwoInt(10, 20)}")
    println("-"*50)

    val addThreeInt = (_:Int) + (_:Int) + (_:Int)
    println(s"Demo of lambda function with '_' addThreeInt : ${addThreeInt(10, 20, 30)}")
    println("-" * 50)

    find_lowest_number(10, 20, 30)

    variable_length_argument_func(1, "Rohit", 3.3, true)
    variable_length_argument_func(1, "Rohit")

  }

}
