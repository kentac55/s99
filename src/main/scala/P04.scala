object P04 {
  def length[T](list: List[T]): Int = {
    def go(l: List[T], acc: Int = 0): Int = l match {
      case Nil => acc
      case _   => go(l.tail, acc + 1)
    }
    go(list)
  }
}
