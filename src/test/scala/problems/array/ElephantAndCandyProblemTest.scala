package problems.array

import org.scalatest._
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

class ElephantAndCandyProblemTest extends FlatSpec with Matchers with TableDrivenPropertyChecks {
  private val elephantAndCandyProblem = ElephantAndCandyProblem

  // format: off
  forAll(
    Table(
      ("input_array","result"),
      (Array("2 3", "4 8 8"),"No"),
      (Array("2 3", "1 1"),"Yes")
    )
  ) {(inputArray:Array[String],result:String) =>
    // format: on

    it should s"return $result for the given input of candies" in {
      elephantAndCandyProblem.resolveConflictOfCandies(inputArray) shouldBe result
    }
  }

  it should "throw ArrayIndexOutOfBoundsException when input is empty" in {
    a[ArrayIndexOutOfBoundsException] should be thrownBy {
      elephantAndCandyProblem.resolveConflictOfCandies(Array.empty)
    }
  }
}
