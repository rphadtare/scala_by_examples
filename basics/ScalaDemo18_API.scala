import scala.collection.breakOut

object ScalaDemo18_API {

  def demo_map_api(): Unit = {
      val nums = List.range(1, 101)
      println(s"nums - $nums")

    val even_nums = nums.map(num => if(num%2 == 0){(num,true)}else{(num, false)})
    println(s"Even nums - $even_nums")

  }

  private def demo_flat_map_api(): Unit = {
    """This is flat map api demo"""

    val line = List("Rohit_Prakash_Phadtare,Pooja_Rohit_Phadtare")
    println(s"input - $line, size: ${line.size} and type: ${line.getClass}")

    val all_names = line.flatMap(names => names.split(",")).flatMap(name => name.split("_"))
    println(s"output - $all_names , size: ${all_names.size} and type: ${all_names.getClass}")

  }

  private def collect_api_demo(): Unit = {
    """This is collect api demo"""
    val nums = List(1, 2, "Rohit")
    val output_nums = nums.collect(
      { case ele: Int => ele.toFloat
        case ele: String => ele.length.toFloat }
    )(breakOut)

    println(s"output - $output_nums")
  }

  private def take_api_demo(): Unit = {
    println("""This is take api demo""")
    val nums = List.range(1, 100)
    println(s"output - ${nums.take(4)}")
  }

  private def sort_api_demo(): Unit = {
    """This is sort api demo"""
    val nums = List.range(1, 100)
    println(s"output - ${nums.sortBy(r => -r)}")
  }

  private def fold_api_demo(): Unit = {
    println("""This is fold api demo""")
    val nums = List.range(1, 5)
    println(s"input - $nums")

    val result = nums.fold(5)((a, b) => (a + b))
    println(s"output - $result")
    println("-"*50)
  }

  private def fold_left_api_demo(): Unit = {
    println("""This is fold left api demo""")
    val names = List(("M", "Rohit"), ("F", "Pooja"))
    println(s"input - $names")

    val result = names.foldLeft("")((accumulated_str, name_tuple:(String, String)) => {
      var salutations = ""
      name_tuple._1 match {
        case "M" => salutations = "Mr."
        case "F" => salutations = "Ms."
      }

      if(accumulated_str.isEmpty){
        salutations + name_tuple._2
      } else {
        accumulated_str + "," + salutations + name_tuple._2
      }

    })

    println(s"result - $result")
    println("-"*50)
  }

  private def fold_right_api_demo(): Unit = {
    println("""This is fold right api demo""")
    val names = List(("M", "Rohit"), ("F", "Pooja"))
    println(s"input - $names")

    val result = names.foldRight("")((name_tuple:(String, String), accumulated_str) => {
      var salutations = ""
      name_tuple._1 match {
        case "M" => salutations = "Mr."
        case "F" => salutations = "Ms."
      }

      if(accumulated_str.isEmpty){
        salutations + name_tuple._2
      } else {
        accumulated_str + "," + salutations + name_tuple._2
      }

    })

    println(s"result - $result")
    println("-"*50)
  }

  private def reduce_api_demo() : Unit = {
    println("""This is reduce api demo""")

    val nums = List.range(1, 6)
    println(s"input - $nums")

    val result = nums.reduce((a, b) => a + b)

    println(s"result - $result")
    println("-"*50)

  }

  private def max_min_api_demo() : Unit = {
    println("""This is max and min api demo""")

    val nums = List.range(1, 6)
    println(s"input - $nums")

    val max_value = nums.max
    val min_value = nums.min

    println(s"result Max: $max_value and min: $min_value")
    println("-"*50)

  }

  private def sum_api_demo() : Unit = {
    println("""This is sum api demo""")

    val nums = List.range(1, 6)
    println(s"input - $nums")

    val sum_value = nums.sum

    println(s"result: $sum_value")
    println("-"*50)

  }


  def main(args: Array[String]): Unit = {
    fold_left_api_demo()
    fold_right_api_demo()
    fold_api_demo()
    max_min_api_demo()
    sum_api_demo()
  }


}
