import P06.isPalindrome

class P06Spec extends UnitSpec {
  "isPalindrome()" should "solve the problem" in {
    assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)
  }
  it should "find out whether a list is a palindrome" in {
    val data = Table(
      ("i", "o"),
      (Nil, true),
      (List(1), true),
      ((1 to 5).toList, false)
    )
    forAll(data) { (i: List[Int], o: Boolean) =>
      assert(isPalindrome(i) == o)
    }
  }
}
