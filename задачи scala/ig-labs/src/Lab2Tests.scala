import org.scalatest.FunSuite

class Lab2Tests extends FunSuite{

  test("Expect to return )") {
    val stream: Stream[Int] = Stream(1, 2, 3, 4, 5, 6)
    val result = stream.takeWhile((x:Int) => x < 4)
    assert(result == List(1, 2, 3))
  }

}
