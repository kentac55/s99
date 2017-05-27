import P01.last

class P01Spec extends UnitSpec {
  "last()" should "solve the problem" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) == 8)
  }
  it should "find the last element of a list" in {
    forAll { (s: List[Int]) =>
      s match {
        case l if l.length == 1 => assert(last(s) == s.last)
        case l if l.nonEmpty    => assert(last(s) == s.last)
        case _ =>
          intercept[NoSuchElementException] {
            last(List.empty[Int])
          }
      }
    }
  }
}
