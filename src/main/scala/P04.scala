object P04 {
  def length[T](l: List[T]): Int = {
    def recLength[A](l: List[A], acc: Int = 0): Int = {
      if (l == Nil) {
        acc
      } else {
        recLength(l.tail, acc + 1)
      }
    }

    recLength(l)
  }
}
