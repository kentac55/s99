import P03.nth

class P03Spec extends UnitSpec {
  "nth()" should "solve the problem" in {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }
  it should "find the Kth element of a list." in {
    forAll { (i: Int, s: List[Int]) =>
      (i, s) match {
        case (x, y) if x < 0 || x > y.length - 1 =>
          intercept[IndexOutOfBoundsException] {
            nth(i, s)
          }
        case (_, _) =>
          assert(nth(i, s) == s(i))
      }
    }
  }
}
