package problems.array.geeks

import org.scalatest._
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

class ArrayRotationTest extends FlatSpec with Matchers with TableDrivenPropertyChecks {

  private val arrayRotation = ArrayRotation
  // format: off
  forAll(
    Table(
      ("input_array", "no_of_rotation", "result_array"),
      (Array(2, 3, 4, 5, 6), 1, Array(3, 4, 5, 6, 2)),
      (Array(2, 3, 4, 5, 6), 2, Array(4, 5, 6, 2, 3)),
      (Array(2, 3, 4, 5, 6), 3, Array(5, 6, 2, 3, 4)),
      (Array(2, 3, 4, 5, 6), 0, Array(2, 3, 4, 5, 6))
    )) { (inputArray: Array[Int], noOfRotation: Int, resultArray: Array[Int]) =>
    // format: on
    it should s"rotate the array with number of rotation $noOfRotation" in {
      arrayRotation.rotate(inputArray, noOfRotation) should contain theSameElementsInOrderAs (resultArray)
    }
  }

  it should "throw ArrayIndexOutOfBoundsException input array is empty " in {
    a[ArrayIndexOutOfBoundsException] should be thrownBy {
      arrayRotation.rotate(Array.empty, 10)
    }
  }
}
