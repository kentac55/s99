object P17 {
  def split[T](loc: Int, list: List[T]): (List[T], List[T]) = {
    def rec(i: Int = loc, l: List[T] = list, acc: List[T] = Nil): (List[T], List[T]) =
      (i, l, acc) match {
        case (x, lst, _) if x > lst.length => throw new NoSuchElementException
        case (x, _, _) if x < 0            => throw new NoSuchElementException
        case (_, Nil, _)                   => throw new NoSuchElementException
        case (0, _2, _1)                   => (_1.reverse, _2)
        case (x, h :: t, _1)               => rec(x - 1, t, h :: _1)
      }
    rec()
  }
}
