object P15 {
  def duplicateN[T](num: Int, list: List[T]): List[T] = {
    list.flatMap(e => Nil.padTo(num, e))
  }
}
