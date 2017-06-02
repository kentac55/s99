import P15.duplicateN

class P15Spec extends UnitSpec {
  "duplicateN()" should "solve the problem" in {
    assert(
      duplicateN(
        3,
        List('a, 'b, 'c, 'c, 'd)
      ) == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }
}
