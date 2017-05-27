import P02.penultimate

class P02Spec extends UnitSpec {
  "penultimate()" should "solve the problem" in {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }
  it should "find the last but one element of a list" in {
    forAll { (s: List[Int]) =>
      s match {
        case l if l.length > 1 => assert(penultimate(s) == s(s.length - 2))
        case _ =>
          intercept[NoSuchElementException] {
            penultimate(List.empty[Int])
          }
      }
    }
  }
}
