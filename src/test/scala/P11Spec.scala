import P11.encodeModified

class P11Spec extends UnitSpec {
  "encodeModified()" should "solve the problem" in {
    assert(
      encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
        == List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)))
  }
  it should "modified run-length encoding" in {
    val samples = Table(
      ("i", "o"),
      (Nil, Nil),
      (List('a), List('a)),
      (List('a, 'b, 'c, 'c, 'b, 'a), List('a, 'b, (2, 'c), 'b, 'a))
    )
    forAll(samples) { (i: List[Symbol], o: List[Any]) =>
      assert(encodeModified(i) == o)
    }
  }
}
