import P20.removeAt

class P20Spec extends UnitSpec {
  "removeAt()" should "solve the problem" in {
    val res = removeAt(1, List('a, 'b, 'c, 'd))
    assert(res._1 == List('a, 'c, 'd))
    assert(res._2 == 'b)
  }
  it should "throw NoSuchElementException" in {
    intercept[NoSuchElementException](removeAt(-1, Nil))
    intercept[NoSuchElementException](removeAt(2, List('a)))
  }
}
