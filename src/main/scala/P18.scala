import java.util.NoSuchElementException

object P18 {
  def slice[T](i: Int, k: Int, list: List[T]): List[T] = {
    def rec(begin: Int = i, end: Int = k, lst: List[T] = list, acc: List[T] = Nil): List[T] =
      (begin, end, lst, acc) match {
        case (0, _, Nil, _)    => throw new NoSuchElementException
        case (_, 0, Nil, _)    => throw new NoSuchElementException
        case (_, _, Nil, _)    => throw new NoSuchElementException
        case (0, 0, _, res)    => res.reverse
        case (0, y, h :: t, a) => rec(0, y - 1, t, h :: a)
        case (x, y, _ :: t, _) => rec(x - 1, y - 1, t)
      }
    rec()
  }
}
