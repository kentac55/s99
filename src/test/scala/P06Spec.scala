import P06.isPalindrome

class P06Spec extends UnitSpec {
  "isPalindrome()" should "solve the problem" in {
    assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)
  }
  it should "find out whether a list is a palindrome" in {
    val samples = Table(
      ("i", "o"),
      (Nil, true),
      (List(1), true),
      (List(1, 2, 3, 4, 5), false)
    )
    forAll(samples) { (i: List[Int], o: Boolean) =>
      assert(isPalindrome(i) == o)
    }
  }
}
