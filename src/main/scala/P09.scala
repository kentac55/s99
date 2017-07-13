object P09 {
  def pack[T](list: List[T]): List[List[T]] = {
    def go(l: List[T], acc: List[List[T]] = Nil): List[List[T]] = (l, acc) match {
      case (Nil, lst)                         => P05.reverse(lst)
      case (h :: t, ah :: at) if h == ah.head => go(t, (h :: ah) :: at)
      case (h :: t, lst)                      => go(t, (h :: Nil) :: lst)
    }
    go(list)
  }
}
