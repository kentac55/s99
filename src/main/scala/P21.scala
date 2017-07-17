object P21 {
  def insertAt[T](elem: T, k: Int, list: List[T]): List[T] = list.splitAt(k) match {
    case (Nil, _) if k < 0 => throw new NoSuchElementException
    case (f, l)            => f ::: elem :: l
  }
}
