import P13.encodeDirect

class P13Spec extends UnitSpec {
  "encodeDirect()" should "solve the problem" in {
    assert(
      encodeDirect(
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      ) == List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    )
  }
  it should "run-length encoding of a list" in {
    val samples = Table(
      ("i", "o"),
      (Nil, Nil),
      (List('a), List((1, 'a))),
      (List('a, 'b, 'c, 'c, 'b, 'a), List((1, 'a), (1, 'b), (2, 'c), (1, 'b), (1, 'a)))
    )
    forAll(samples) { (i: List[Symbol], o: List[(Int, Symbol)]) =>
      assert(encodeDirect(i) == o)
    }
  }
}
