package oop

object StringDemo {

  def stringImmutabilityDemo(): Unit = {

    var str = new String("This")
    var str_sb = new StringBuilder("This")

    println("before ")
    println(s"str: $str")
    println(s"str_sb: $str_sb")

    str += " is test!!"
    str_sb.addAll(" is test!!")

    println("after..")
    println(s"str: $str")
    println(s"str_sb: $str_sb")


  }

  def compareToDemo(): Unit = {

    var str = "Rohit"
    var str1 = "Rajani"
    var str2 = "Pooja"
    var str3 = "Rohit"

    println(s"$str compare to $str2 : ${str.compareTo(str2)}")
    println(s"$str1 compare to $str : ${str1.compareTo(str)}")
    println(s"$str3 compare to $str : ${str3.compareTo(str)}")

  }

  def trimDemo(): Unit = {
    var s = " India "
    var s1 = "is "
    var s2 = " country"
    println(s.trim + " " + s1.trim + " " + s2.trim)

  }

  def subStringDemo(): Unit = {
    var s = "India is best country!! India is my country!!"
    println(s)
    println(s"s.substring(0,6): ${s.substring(0, 6)}")
    println(s"s.substring(24): ${s.substring(24)}")

    println(s"$s contains 'best': ${s.contains("best")}")

    println(s"last index of 'India' in string: ${s.lastIndexOf("India")}")

    println(s"Replacing all instances of 'India' in string: ${s.replace("India", "Bharat")}")

  }

  def main(args: Array[String]): Unit = {
    var str = "India"
    println(s"Character at 3rd position in India: ${str.charAt(3)}")

    var str1 = "USA"
    var str2 = new String("India")

    var str_sb = new StringBuilder("India")

    //compare using ==
    println(s"str($str):${str.getClass} == str2($str2):${str2.getClass} then result is ${str == str2}")
    println(s"str($str):${str.getClass} == str_sb(${str_sb}):${str_sb.getClass} then result is ${str == str_sb}")

    //compare using equals
    println(s"str($str).equals(str2($str2)) then result is ${str.equals(str2)}")
    println(s"str($str).equals(str_sb($str_sb)) then result is ${str.equals(str_sb.toString())}")

    //equal ignore case
    println(s"str($str).equalsIgnoreCase('INdia') then result is ${str.equalsIgnoreCase("INdia")}")

    compareToDemo()

    println(s"Length of '$str' is ${str.length}")

    trimDemo

    subStringDemo

  }


}
