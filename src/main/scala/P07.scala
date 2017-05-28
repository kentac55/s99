object P07 {
  def flatten(list: List[Any]): List[Any] = list match {
    case Nil               => Nil
    case (h: List[_]) :: t => flatten(h) ::: flatten(t)
    case h :: t            => h :: flatten(t)
  }
}
