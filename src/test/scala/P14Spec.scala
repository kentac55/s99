import P14.duplicate

class P14Spec extends UnitSpec {
  "duplicate()" should "solve the problem" in {
    assert(
      duplicate(
        List('a, 'b, 'c, 'c, 'd)
      ) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    )
  }
  it should "duplicate the elements of a list" in {
    val samples = Table(
      ("i", "o"),
      (Nil, Nil),
      (List('a), List('a, 'a)),
      (List('a, 'a, 'a, 'b), List('a, 'a, 'a, 'a, 'a, 'a, 'b, 'b))
    )
    forAll(samples) { (i: List[Symbol], o: List[Symbol]) =>
      assert(duplicate(i) == o)
    }
  }
}
