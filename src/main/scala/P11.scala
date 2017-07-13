object P11 {
  def encodeModified[T](list: List[T]): List[Any] = {
    def go(encoded: List[(Int, T)], acc: List[Any] = Nil): List[Any] = (encoded, acc) match {
      case (Nil, res)               => P05.reverse(res)
      case (h :: t, l) if h._1 == 1 => go(t, h._2 :: l)
      case (h :: t, l)              => go(t, h :: l)
    }
    go(P10.encode(list))
  }
}
