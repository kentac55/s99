object P06 {
  def isPalindrome[T](l: List[T]): Boolean = {
    def recIsPalindrome[A](a: List[A], b: List[A]): Boolean = (a, b) match {
      case (Nil, Nil)                                 => true
      case (headA :: _, headB :: _) if headA != headB => false
      case (_, _)                                     => recIsPalindrome(a.tail, b.tail)
    }
    import P05.reverse
    recIsPalindrome(l, reverse(l))
  }
}
