/**
  * Created by Paul on 25.12.2016.
  */
import org.scalatest.FunSuite

class Lab1Tests extends FunSuite {

  def pred[A](s: A): Boolean = {
    if (s == 2) true
    else false
  }

  test("Should return Stream(2, 2, 2)") {
    val stream = Stream(2, 2, 2, 3, 4)
    val result = Lab2.takeWhile(stream, pred)
    assert(result == Stream(2, 2, 2))
  }

}
