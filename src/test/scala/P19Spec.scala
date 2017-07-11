import P19.rotate

class P19Spec extends UnitSpec {
  "rotate()" should "rotate list elements in forward order" in {
    assert(
      rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        == List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
  }
  it should "rotate list elements in reverse order" in {
    assert(
      rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        == List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }
  it should "rotate a list N places to the left" in {}
}
