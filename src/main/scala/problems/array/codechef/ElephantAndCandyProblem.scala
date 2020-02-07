package problems.array.codechef

import scala.io.StdIn

// format: off
/** *Problem Statement*
  * A Little Elephant and his friends from the Zoo of Lviv like candies very much.
  * There are N elephants in the Zoo. The elephant with number K (1 ≤ K ≤ N) will
  * be happy if he receives at least AK candies. There are C candies in all in the Zoo.
  * The Zoo staff is interested in knowing whether it is possible to make all the N elephants
  * happy by giving each elephant at least as many candies as he wants, that is, the Kth elephant
  * should receive at least AK candies. Each candy can be given to only one elephant.
  * Print Yes if it is possible and No otherwise.
  */

// format: on

object ElephantAndCandyProblem {

  private def takeUserInput(numberOfInputTest: String) = {
    if (numberOfInputTest != null) {
      val inputArray: Array[String] =
        Array.fill(numberOfInputTest.toInt)(StdIn.readLine())
      resolveConflictOfCandies(inputArray)
    }
  }

  def resolveConflictOfCandies(testArray: Array[String]): String = {
    var isPossible = ""
    val inputArray = testArray.map(_.split("\\s").map(_.toLong))
    var candies    = inputArray(0)(1)
    for (i <- 0 to inputArray(1).length - 1)
      candies -= inputArray(1)(i)
    if (candies <= 0) isPossible = "No" else isPossible = "Yes"
    println(isPossible)
    isPossible
  }
}
