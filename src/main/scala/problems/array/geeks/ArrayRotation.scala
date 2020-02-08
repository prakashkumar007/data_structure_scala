package problems.array.geeks

object ArrayRotation extends App {

  def rotate(testArray: Array[Int], noOfRotation: Int) = {
    for (_ <- 0 to noOfRotation - 1) {
      var temp = testArray(0)
      for (i <- 0 to testArray.length - 2) {
        testArray(i) = testArray(i + 1)
        testArray(i + 1) = temp
      }

    }
    testArray
  }
}
