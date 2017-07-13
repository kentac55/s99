object P05 {
  def reverse[T](list: List[T]): List[T] = {
    def go(l: List[T], acc: List[T] = Nil): List[T] = l match {
      case Nil => acc
      case _   => go(l.tail, l.head :: acc)
    }
    go(list)
  }
}
