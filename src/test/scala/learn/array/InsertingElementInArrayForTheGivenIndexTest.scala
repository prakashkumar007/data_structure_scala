package learn.array

import org.scalatest._
import org.scalatest.matchers.should.Matchers

class InsertingElementInArrayForTheGivenIndexTest extends FlatSpec with Matchers {

  private val indexToInsert: Int                      = 2
  private val valueOfIndex: Int                       = 56
  private val insertingElementInArrayForTheGivenIndex = InsertingElementInArrayForTheGivenIndex

  it should "insert the element at the mentioned index " in {
    val testArray   = Array(1, 2, 3, 4, 5, 6, 8, 0)
    val resultArray = Array(1, 2, 56, 3, 4, 5, 6, 8)
    val results = insertingElementInArrayForTheGivenIndex.insertElementAtIndex(indexToInsert,
                                                                               valueOfIndex,
                                                                               testArray)
    results should contain theSameElementsAs (resultArray)
  }

  it should "throw ArrayIndexOutOfBoundsException if an element is inserted out of index " in {
    val indexToInsert: Int = 10
    val testArray          = Array(1, 2, 3, 4, 5, 6, 8, 0)

    a[ArrayIndexOutOfBoundsException] should be thrownBy {
      insertingElementInArrayForTheGivenIndex.insertElementAtIndex(indexToInsert,
                                                                   valueOfIndex,
                                                                   testArray)
    }
  }
}
