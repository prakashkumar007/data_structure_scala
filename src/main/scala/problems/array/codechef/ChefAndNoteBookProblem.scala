package problems.array.codechef

import scala.io.StdIn

//format:off
/**
  * Chef likes to write poetry. Today, he has decided to write a X pages long poetry,
  * but unfortunately his notebook has only Y pages left in it. Thus he decided to buy
  * a new CHEFMATE notebook and went to the stationary shop. Shopkeeper showed him some
  * N notebooks, where the number of pages and price of the ith one are Pi pages and Ci
  * rubles respectively. Chef has spent some money preparing for Ksen's birthday, and
  * then he has only K rubles left for now.Chef wants to buy a single notebook such that
  * the price of the notebook should not exceed his budget and he is able to complete his poetry.
  * Help Chef accomplishing this task. You just need to tell him whether he can buy such a notebook
  * or not. Note that Chef can use all of the Y pages in the current notebook, and Chef can buy only
  * one notebook because Chef doesn't want to use many notebooks.
  * @variables: noOfPagesRequiredToWritePoetry,noOfPagesLeftInExistingNotebook,budgetInRubles,noteBooksInTheShop
  */
//format:on

object ChefAndNoteBookProblem extends App {
  val testCases = StdIn.readInt
  for (_ <- 0 until testCases) {
    val Array(x, y, k, n) = StdIn.readLine().split(" ").map(_.toInt)
    var exists            = false

    for (_ <- 0 until n) {
      val Array(p, c) = StdIn.readLine().split(" ").map(_.toInt)
      if (p >= x - y && c <= k) exists = true
    }

    if (exists) println("LuckyChef") else println("UnluckyChef")
    System.exit(0)

  }

}
