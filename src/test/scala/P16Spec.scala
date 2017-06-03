import P16.drop

class P16Spec extends UnitSpec {
  "drop()" should "solve the problem" in {
    assert(
      drop(
        3,
        List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      ) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    )
  }
}
