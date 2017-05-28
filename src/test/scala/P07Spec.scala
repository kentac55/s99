import P07.flatten

class P07Spec extends UnitSpec {
  "flatten()" should "solve the problem" in {
    assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }
  it should "flatten a nested list structure" in {
    val samples = Table(
      ("i", "o"),
      (List(1), List(1)),
      (List(List(List(List(1), 2), 3), 4), (1 to 4).toList),
      (Nil, Nil)
    )
    forAll(samples) { (i: List[Any], o: List[Any]) =>
      assert(flatten(i) == o)
    }
  }
}
