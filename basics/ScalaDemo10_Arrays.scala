object ScalaDemo10_Arrays {

  def singleDimensionArray(): Unit = {

    var arr = Array("Rohit", "Pooja", "Rajani") // array with elements
    var arrOfInt = new Array[Int](5) // array of integers
    var arrayOfElements = Array(1, "India") // array of Any


    for(name <- arr){
      println(name)
    }

    println(s"Size of arrOfInt array : ${arrOfInt.length}")
    println("Update element at position 2 - Shrikant")
    arr(2) = "Shrikant"
    println("Array post updataion - ")
    arr.foreach(println)

    println("Getting elements using apply() - " + arr.apply(1))

    arrOfInt.update(2, 10)
    println("Array post update - " + arrOfInt(2))

    Array.fill[Int](5)(10).foreach(println)

    Array.range(0, 10, 2).foreach(e => print(e + "\t"))

    //This will work only in Scala - 2.13
    println("Copy as demo: ")
    //Array.copyAs[String](arr, 5).foreach(e => print(e + "\t"))

    println()
    arrOfInt = Array.fill[Int](5)(0)
    var arrOfInt2 = Array.range(1,6)
    println("\nElements in arrOfInt :")
    arrOfInt.foreach(e => print(e + "\t"))
    println("\nElements in arrOfInt2 :")
    arrOfInt2.foreach(e => print(e + "\t"))

    println("\nCopying first 3 elements from arrOfInt2 into arrOfInt1 at last three position")
    Array.copy(arrOfInt2, 0, arrOfInt, 2, 3)
    println("Post update...")
    println("Elements in arrOfInt :")
    arrOfInt.foreach(e => print(e + "\t"))
    println("\nElements in arrOfInt2 :")
    arrOfInt2.foreach(e => print(e + "\t"))

  }

  def singleDimensionArray2(): Unit = {

    var arrOfInt = Array.range(1,6)
    var arrOfInt1 = Array.range(10,15)

    println("Elements in arrOfInt - ")
    arrOfInt.foreach(e => print(e + "\t"))

    println("Elements in arrOfInt1 - ")
    arrOfInt1.foreach(e => print(e + "\t"))

    arrOfInt1 = Array.concat[Int](arrOfInt1, arrOfInt)

    println("Elements in concatenated array - ")
    arrOfInt1.foreach(e => print(e + "\t"))

  }

  def multiDimesnionArray(): Unit = {

    var arr = Array.ofDim[Int](3,3)
    var arr1 = Array(Array.range(0,3), Array.range(10,13), Array.range(20,23))

    println("Traversing through arr1 : ")
    for(i <- 0 to 2){
      println("")
      for(j <- 0 to 2){
       print(arr1(i)(j) + "\t")
      }
    }

    println("Traversing through arr before copying elements from arr1 : ")
    for (i <- 0 to 2) {
      println("")
      for (j <- 0 to 2) {
        print(arr(i)(j) + "\t")
      }
    }

    println("Copying arr1 to arr...")
    Array.copy(arr1, 0, arr, 0, 3)
    println("Traversing through arr : ")
    for (i <- 0 to 2) {
      println("")
      for (j <- 0 to 2) {
        print(arr(i)(j) + "\t")
      }
    }

    println("")
    var jagged_arr = Array(Array.range(0,3), Array.range(10,16), Array.range(20,24))
    println("jagged array created with rows - " + jagged_arr.length)
    println("Traversing through jagged array - ")

    for(row_index <- 0 until jagged_arr.length){
      println("")
      for(col_index <- 0 until jagged_arr(row_index).length) {
        print(jagged_arr(row_index)(col_index) + "\t")
      }
    }



  }

  def main(args: Array[String]): Unit = {
    multiDimesnionArray()
  }


}
