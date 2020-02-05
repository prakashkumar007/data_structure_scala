package problems.array

object InsertingElementInArrayForTheGivenIndex {

  def insertElementAtIndex(index: Int, valueOfIndex: Int, inputArray: Array[Int]): Array[Int] = {
    for (i <- inputArray.length - 1 to index by -1) {
      inputArray(i) = inputArray(i - 1)
    }
    inputArray(index) = valueOfIndex
    inputArray
  }
}
