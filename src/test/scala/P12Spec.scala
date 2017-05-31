import P12.decode

class P12Spec extends UnitSpec {
  "decode()" should "solve the problem" in {
    assert(
      decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) ==
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    )
  }
  it should "decode a run-length encoded list" in {
    val samples = Table(
      ("i", "o"),
      (Nil, Nil),
      (List((1, 'a)), List('a)),
      (List((1, 'a), (1, 'b), (2, 'c), (1, 'b), (1, 'a)), List('a, 'b, 'c, 'c, 'b, 'a))
    )
    forAll(samples) { (i: List[(Int, Symbol)], o: List[Symbol]) =>
      assert(decode(i) == o)
    }
  }
}
