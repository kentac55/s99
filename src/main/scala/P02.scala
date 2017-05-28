object P02 {
  def penultimate[T](list: List[T]): T = list match {
    case _ :: t if t.length > 1  => penultimate(list.tail)
    case _ :: t if t.length == 1 => list.head
    case _                       => throw new NoSuchElementException
  }
}
