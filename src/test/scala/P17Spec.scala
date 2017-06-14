import P17.split

class P17Spec extends UnitSpec {
  "split()" should "solve the problem" in {
    val res = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(
      split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        == res)
  }
  it should "cause NoSuchElementException" in {
    val samples = Table(
      ("int", "list"),
      (5, List('a, 'b)),
      (-1, List('a, 'b)),
      (0, Nil)
    )
    forAll(samples) { (int: Int, list: List[Symbol]) =>
      intercept[NoSuchElementException](split(int, list))
    }
  }
}
