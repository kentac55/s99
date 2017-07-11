object P19 {
  def rotate[T](n: Int, list: List[T]): List[T] = (n, list) match {
    case (i, res) if i == 0   => res
    case (i, h :: t) if i > 0 => rotate(i - 1, t ::: List(h))
    case (i, l) if i < 0      => rotate(i + 1, l.last :: l.init)
  }
}
