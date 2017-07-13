object P13 {
  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    type S = List[(Int, T)]
    def go(lst: List[T], acc: S = Nil): S = (lst, acc) match {
      case (Nil, res)                       => reverse(res)
      case (h :: t, ah :: at) if h == ah._2 => go(t, (ah._1 + 1, h) :: at)
      case (h :: t, l)                      => go(t, (1, h) :: l)
    }
    def reverse(lst: S): S = {
      def recReverse(l: S, acc: S = Nil): S = l match {
        case Nil => acc
        case _   => recReverse(l.tail, l.head :: acc)
      }
      recReverse(lst)
    }
    go(list)
  }
}
