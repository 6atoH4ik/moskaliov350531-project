// Написать обобщенную функцию сложения/умножения чисел в
// диапазоне.

object Lab1 {

  /**
    *
    * @param number
    * @param c callback function
    * @return result of the operation in seq
    */
  def task(number: Int, c: (Int, Int) => Int): Int = {
    def factorialWithAccumulator(accumulator: Int, number: Int): Int = {
      if (number == 1) accumulator
      else factorialWithAccumulator(c(accumulator, number), number - 1)
    }
    factorialWithAccumulator(1, number)
  }

  /**
    *
    * @param a
    * @param b
    * @return sum of two numbers
    */
  def sum(a: Int, b: Int): Int = a + b

  /**
    *
    * @param a
    * @param b
    * @return multiply two numbers
    */
  def multiply(a: Int, b: Int): Int = a * b

  def main(args: Array[String]):Unit = {
    println("Произведение чисел от 1 до 5 = " + task(5, multiply))
    println("Сумма чисел от 1 до 5 = " + task(5, sum))
  }
}