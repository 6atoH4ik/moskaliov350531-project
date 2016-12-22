// На языке Scala написать функцию takeWhile, возвращающую
// элементы Stream, пока они удовлетворяют предикату.
// def takeWhile(p: A => Boolean): Stream[A]

object Lab2{
  def main(args: Array[String]) {
    val stream: Stream[Int] = Stream(1, 2, 3, 4, 5, 6)
    println("Stream:" + stream.toList)

    val streamLessThan4: Stream[Int] = stream.takeWhile((x: Int) => x < 4)
    println("stream(<4):" + streamLessThan4.toList)
  }

}

trait Stream[+A] {
  import Stream._

  def takeWhile(p: A => Boolean): Stream[A] =  this match {   //условие возврата
    case Empty => empty
    case Cons(h, t) if p(h()) => cons(h(), t().takeWhile(p))
    case Cons(h, t) if !p(h()) => empty
  }

  def toList: List[A] = {
    @annotation.tailrec
    def go(l: List[A], s: Stream[A]): List[A] = s match {
      case Empty => l.reverse
      case Cons(h,t) => go(h()::l, t())
    }

    go(List(), this)
  }
}


case object Empty extends Stream[Nothing]
case class Cons[+A](h: () => A, t: () => Stream[A]) extends Stream[A]

object Stream {
  def empty[A]: Stream[A] = Empty

  def cons[A](hd: => A, tl: => Stream[A]): Stream[A] = {
    lazy val head = hd
    lazy val tail = tl
    Cons(() => head, () => tail)
  }

  def apply[A](as: A*): Stream[A] =
    if(as.isEmpty) empty else cons(as.head, apply(as.tail: _*))
}