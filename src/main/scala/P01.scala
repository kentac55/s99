object P01 {
  def last[T](list: List[T]): T = list match {
    case h :: Nil => h
    case _ :: t   => last(t)
    case _        => throw new NoSuchElementException
  }
}
