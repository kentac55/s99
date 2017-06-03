object P16 {
  def drop[T](n: Int, list: List[T]): List[T] = {
    (1 to list.length)
      .filterNot(_ % n == 0)
      .map(_ - 1)
      .foldLeft(List.empty[T])((z, n) => list(n) :: z)
      .reverse
  }
}
