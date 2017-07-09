import P18.slice

class P18Spec extends UnitSpec {
  "slice()" should "solve the problem" in {
    assert(
      slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        == List('d, 'e, 'f, 'g))
  }
  it should "cause NoSuchElementException" in {
    val samples = Table(
      ("begin", "end", "list"),
      (0, 5, Nil),
      (1, 0, Nil),
      (2, 4, Nil)
    )
    forAll(samples) { (begin: Int, end: Int, list: List[Symbol]) =>
      intercept[NoSuchElementException](slice(begin, end, list))
    }
  }
}
