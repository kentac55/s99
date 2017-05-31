object P14 {
  def duplicate[T](list: List[T]): List[T] = {
    def rec(lst: List[T], acc: List[T] = Nil): List[T] = (lst, acc) match {
      case (Nil, res) => P05.reverse(res)
      case (h :: t, l) if l.length % 2 == 1 => rec(t, h :: l)
      case (h :: t, l) => rec(h :: t, h :: l)
    }
    rec(list)
  }
}
