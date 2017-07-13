object P08 {
  def compress[T](list: List[T]): List[T] = {
    def go(l: List[T], acc: List[T] = Nil): List[T] = l match {
      case Nil                   => P05.reverse(acc)
      case h :: Nil              => go(Nil, h :: acc)
      case h :: t if h != t.head => go(t, h :: acc)
      case h :: t if h == t.head => go(t, acc)
    }
    go(list)
  }
}
