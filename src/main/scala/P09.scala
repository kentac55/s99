object P09 {
  def pack[T](list: List[T]): List[List[T]] = {
    def rec(l: List[T], acc: List[List[T]] = Nil): List[List[T]] = (l, acc) match {
      case (Nil, lst)                         => P05.reverse(lst)
      case (h :: t, ah :: at) if h == ah.head => rec(t, (h :: ah) :: at)
      case (h :: t, lst)                      => rec(t, (h :: Nil) :: lst)
    }
    rec(list)
  }
}
