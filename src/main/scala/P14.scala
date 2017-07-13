object P14 {
  def duplicate[T](list: List[T]): List[T] = {
    def go(lst: List[T], acc: List[T] = Nil): List[T] = (lst, acc) match {
      case (Nil, res) => P05.reverse(res)
      case (h :: t, l) if l.length % 2 == 1 => go(t, h :: l)
      case (h :: t, l) => go(h :: t, h :: l)
    }
    go(list)
  }
}
