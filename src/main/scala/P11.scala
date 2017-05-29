object P11 {
  def encodeModified[T](list: List[T]): List[Any] = {
    def rec(encoded: List[(Int, T)], acc: List[Any] = Nil): List[Any] = (encoded, acc) match {
      case (Nil, res)               => P05.reverse(res)
      case (h :: t, l) if h._1 == 1 => rec(t, h._2 :: l)
      case (h :: t, l)              => rec(t, h :: l)
    }
    rec(P10.encode(list))
  }
}
