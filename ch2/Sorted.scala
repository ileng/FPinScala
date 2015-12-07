object Sorted {

  @annotation.tailrec
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (as.length <= 1) true
    else if (ordered(as(0), as(1)))
      isSorted(as.tail, ordered)
    else false
  }

  def main(args: Array[String]) = {
    val arr1 = Array(1, 2, 3)
    val arr2 = Array(3, 1)

    assert(isSorted(arr1, (x: Int, y: Int) => x < y), "This should be true")
      assert(!isSorted(arr2, (x: Int, y: Int) => x < y), "This should be false")
  }
}
