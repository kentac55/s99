object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    def go(a: List[T], b: List[T]): Boolean = (a, b) match {
      case (Nil, Nil)                     => true
      case (ha :: _, hb :: _) if ha != hb => false
      case (_, _)                         => go(a.tail, b.tail)
    }
    import P05.reverse
    go(list, reverse(list))
  }
}
