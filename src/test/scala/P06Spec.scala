import P06.isPalindrome

class P06Spec extends UnitSpec {
  "isPalindrome()" should "solve the problem" in {
    assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)
  }
  it should "find out whether a list is a palindrome" in {
    val validList = Table(
      "v",
      Nil,
      List(1)
    )
    forAll(validList) { (v: List[Int]) =>
      assert(isPalindrome(v) == true)
    }
  }
}
