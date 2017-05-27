object P04 {
  def length[T](l: List[T]): Int = {
    def recLength[A](lst: List[A], acc: Int = 0): Int = lst match {
      case Nil => acc
      case _   => recLength(lst.tail, acc + 1)
    }
    recLength(l)
  }
}
