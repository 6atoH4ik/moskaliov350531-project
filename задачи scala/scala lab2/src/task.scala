/*
  * Created by Paul on 21.12.2016.
  */



object task {

    def task(number: Int, c: (Int, Int) => Int): Int = {
      def factorialWithAccumulator(accumulator: Int, number: Int): Int = {
        if (number == 1) accumulator
        else factorialWithAccumulator(c(accumulator, number), number - 1)
      }
      factorialWithAccumulator(1, number)
    }

    def sum(a: Int, b: Int): Int = a + b

    def multiply(a: Int, b: Int): Int = a * b


    def main(args: Array[String]):Unit = {
      println("Произведение чисел от 1 до 5 = " + task(5, multiply))
      println("Сумма чисел от 1 до 5 = " + task(5, sum))

      println("Произведение чисел от 1 до 40 = " + task(40, multiply))
      println("Сумма чисел от 1 до 40 = " + task(40, sum))

      println("Произведение чисел от 1 до 9 = " + task(9, multiply))
      println("Сумма чисел от 1 до 9 = " + task(9, sum))



    }

}