object P05 {
  def reverse[T](l: List[T]): List[T] = {
    def recReverse[A](lst: List[A], acc: List[A] = Nil): List[A] = lst match {
      case Nil => acc
      case _   => recReverse(lst.tail, lst.head :: acc)
    }
    recReverse(l)
  }
}
