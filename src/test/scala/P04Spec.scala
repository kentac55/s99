import P04.length

class P04Spec extends UnitSpec {
  "length()" should "solve the problem" in {
    assert(length(List(1, 1, 2, 3, 5, 8)) == 6)
  }
  it should "find the number of elements of a list" in {
    forAll { (s: List[Int]) =>
      assert(length(s) == s.length)
    }
  }
}
