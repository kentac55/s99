import P09.pack

class P09Spec extends UnitSpec {
  "pack()" should "solve the problem" in {
    assert(
      pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(
        List('a, 'a, 'a, 'a),
        List('b),
        List('c, 'c),
        List('a, 'a),
        List('d),
        List('e, 'e, 'e, 'e)))
  }
  it should "pack consecutive duplicates of list elements into sublists" in {
    val samples = Table(
      ("i", "o"),
      (Nil, Nil),
      (List('a), List(List('a))),
      (List('a, 'b, 'c, 'c, 'a, 'b), List(List('a), List('b), List('c, 'c), List('a), List('b)))
    )
    forAll(samples) { (i: List[Symbol], o: List[List[Symbol]]) =>
      assert(pack(i) == o)
    }
  }
}
