import P05.reverse

class P05Spec extends UnitSpec {
  "reverse()" should "solve the problem" in {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }
  it should "reverse a list" in {
    forAll { (s: List[Int]) =>
      assert(reverse(s) == s.reverse)
    }
  }
}
