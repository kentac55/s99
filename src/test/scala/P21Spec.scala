import P21.insertAt

class P21Spec extends UnitSpec {
  "insertAt()" should "solve the problem" in {
    assert(insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
  }
  it should "throw NoSuchElementException when it's given invalid k" in {
    intercept[NoSuchElementException](insertAt('new, -1, List('a, 'b)))
  }
}
