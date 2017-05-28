object P03 {
  def nth[T](index: Int, list: List[T]): T = (index, list) match {
    case (i, h :: _) if i == 0               => h
    case (i, l) if i < 0 || i > l.length - 1 => throw new IndexOutOfBoundsException
    case (_, _)                              => nth(index - 1, list.tail)
  }
}
