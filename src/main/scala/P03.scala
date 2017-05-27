object P03 {
  def nth[T](i: Int, l: List[T]): T = (i, l) match {
    case (x, head :: _) if x == 0            => head
    case (x, y) if x < 0 || x > y.length - 1 => throw new IndexOutOfBoundsException
    case (_, _)                              => nth(i - 1, l.tail)
  }
}
