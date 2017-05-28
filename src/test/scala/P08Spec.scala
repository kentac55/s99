import P08.compress

class P08Spec extends UnitSpec {
  "compress()" should "solve the problem" in {
    assert(
      compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c,
        'a, 'd, 'e))
  }
  it should "eliminate consecutive duplicates of list elements" in {
    val samples = Table(
      ("i", "o"),
      (Nil, Nil),
      (List('a), List('a)),
      (List('a, 'b, 'c, 'd, 'e), List('a, 'b, 'c, 'd, 'e))
    )
    forAll(samples) { (i: List[Symbol], o: List[Symbol]) =>
      assert(compress(i) == o)
    }
  }
}
