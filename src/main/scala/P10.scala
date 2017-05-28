object P10 {
  def encode[T](list: List[T]): List[(Int, T)] = {
    def rec(l: List[T], acc: List[(Int, T)] = Nil): List[(Int, T)] = (l, acc) match {
      case (Nil, res)                       => P05.reverse(res)
      case (h :: t, ah :: at) if h == ah._2 => rec(t, (ah._1 + 1, ah._2) :: at)
      case (h :: t, lst)                    => rec(t, (1, h) :: lst)
    }
    rec(list)
  }
}
