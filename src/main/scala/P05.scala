object P05 {
  def reverse[T](list: List[T]): List[T] = {
    def rec(l: List[T], acc: List[T] = Nil): List[T] = l match {
      case Nil => acc
      case _   => rec(l.tail, l.head :: acc)
    }
    rec(list)
  }
}
