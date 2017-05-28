object P04 {
  def length[T](list: List[T]): Int = {
    def rec(l: List[T], acc: Int = 0): Int = l match {
      case Nil => acc
      case _   => rec(l.tail, acc + 1)
    }
    rec(list)
  }
}
