object P12 {
  def decode[T](list: List[(Int, T)]): List[T] = {
    def rec(encoded: List[(Int, T)], acc: List[T] = Nil): List[T] = (encoded, acc) match {
      case (Nil, res)  => P05.reverse(res)
      case (h :: t, l) => rec(t, appendHead(l, h._1, h._2))
    }
    def appendHead(l: List[T], i: Int, elem: T): List[T] = i match {
      case 0 => l
      case x => appendHead(elem :: l, x - 1, elem)
    }
    rec(list)
  }
}
