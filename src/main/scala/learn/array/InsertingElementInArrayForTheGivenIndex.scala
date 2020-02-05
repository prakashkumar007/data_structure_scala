package learn.array

import scala.io.StdIn

object InsertingElementInArrayForTheGivenIndex extends App {

  println("Taking index input from user :")
  private val inputIndex: Int = StdIn.readInt
  println(s"Value to be stored at index $inputIndex :")
  private val valueOfInputIndex: Int = StdIn.readInt
  println(s"Max of array value:")
  private val inputArrayMaxSize: Int = StdIn.readInt
  println(s"Fill the array with max $inputArrayMaxSize")
  private val inputArray: Array[Int] =
    Array.fill(inputArrayMaxSize + 1)(StdIn.readInt)

  println(
    s"Calling the function to insert the element at $inputIndex of the array " +
      s"${insertElementAtIndex(inputIndex, valueOfInputIndex, inputArray).map(x =>
        println(s"value found $x"))}")

  def insertElementAtIndex(index: Int, valueOfIndex: Int, inputArray: Array[Int]): Array[Int] = {
    for (i <- inputArray.length - 1 to index by -1) {
      inputArray(i) = inputArray(i - 1)
    }
    inputArray(index) = valueOfIndex
    inputArray
  }
}
