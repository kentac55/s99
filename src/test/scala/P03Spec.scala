import P03.nth

class P03Spec extends UnitSpec {
  "nth()" should "solve the problem" in {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }
  it should "find the Kth element of a list." in {
    forAll { (idx: Int, lst: List[Int]) =>
      (idx, lst) match {
        case (i, l) if i < 0 || i > l.length - 1 =>
          intercept[IndexOutOfBoundsException] {
            nth(idx, lst)
          }
        case (_, _) =>
          assert(nth(idx, lst) == lst(idx))
      }
    }
  }
}
