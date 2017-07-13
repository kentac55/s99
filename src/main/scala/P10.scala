object P10 {
  def encode[T](list: List[T]): List[(Int, T)] = {
    def go(packed: List[List[T]], acc: List[(Int, T)] = Nil): List[(Int, T)] =
      (packed, acc) match {
        case (Nil, res)  => P05.reverse(res)
        case (h :: t, l) => go(t, (h.length, h.head) :: l)
      }
    go(P09.pack(list))
  }
}
