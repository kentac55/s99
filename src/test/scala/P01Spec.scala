import P01.last

class P01Spec extends UnitSpec {
  "last()" should "solve the problem" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) == 8)
  }
  it should "find the last element of a list" in {
    forAll { (l: List[Int]) =>
      l match {
        case l if l.length == 1 => assert(last(l) == l.last)
        case l if l.nonEmpty    => assert(last(l) == l.last)
        case _ =>
          intercept[NoSuchElementException] {
            last(List.empty[Int])
          }
      }
    }
  }
}
