object P08 {
  def compress[T](list: List[T]): List[T] = {
    def rec(l: List[T], acc: List[T] = Nil): List[T] = l match {
      case Nil                   => P05.reverse(acc)
      case h :: Nil              => rec(Nil, h :: acc)
      case h :: t if h != t.head => rec(t, h :: acc)
      case h :: t if h == t.head => rec(t, acc)
    }
    rec(list)
  }
}
