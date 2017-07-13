object P20 {
  def removeAt[T](k: Int, list: List[T]): (List[T], T) = list.splitAt(k) match {
    case (Nil, _) if k < 0 => throw new NoSuchElementException
    case (l, h :: t)       => (l ::: t, h)
    case (_, Nil)          => throw new NoSuchElementException
  }
}
