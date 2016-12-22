import org.scalatest.FunSuite

class Lab1Tests extends FunSuite{

  test("Expect to return 15") {
    val result = Lab1.task(5, Lab1.sum)
    assert(result == 15)
  }

  test("Expect to return 120") {
    val result = Lab1.task(5, Lab1.multiply)
    assert(result == 120)
  }

}
