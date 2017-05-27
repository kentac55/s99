object P02 {
  def penultimate[T](l: List[T]): T = l match {
    case _ :: tail if tail.length > 1  => penultimate(l.tail)
    case _ :: tail if tail.length == 1 => l.head
    case _                             => throw new NoSuchElementException
  }
}
