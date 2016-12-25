// На языке Scala написать функцию takeWhile, возвращающую
// элементы Stream, пока они удовлетворяют предикату.
// def takeWhile(p: A => Boolean): Stream[A]

object Lab2{

  import Stream._

  def takeWhile[A](s: Stream[A], f: A => Boolean): Stream[A] = s match {
    case h #:: t if (f(h)) => h #:: takeWhile(t, f)
    case _ => Stream.Empty
  }

  val range  = Stream(1 to 500).toString
  def get(v: Int): Boolean = v < 30
  range.takeWhile (get => true)

  def main(args: Array[String]) : Unit = {
    println(range)
  }

}