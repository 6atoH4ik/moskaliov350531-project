// Написать обобщенную функцию сложения/умножения чисел в
// диапазоне.

object Lab1 {
  def Sum(start: BigInt, end: BigInt) : BigInt = {
    if (start > end) 0 else start + Sum(start+1, end)
  }

  def Mult(start: BigInt, end: BigInt) : BigInt = {
    if (start > end) 1 else start * Mult(start+1, end)
  }

  def SumTail( start: BigInt, end: BigInt) : BigInt = {
    SumTailAccum(start, end, 0)
  }

  def SumTailAccum( start : BigInt, end : BigInt, acc: BigInt) : BigInt = {
    if(start > end) acc else SumTailAccum(start+1, end, acc+start)
  }

  def MultTail(start: BigInt, end: BigInt) : BigInt = {
    MultTailAccum(start, end, 1)
  }

  def MultTailAccum( start : BigInt, end : BigInt, acc: BigInt) : BigInt = {
    if(start > end) acc else MultTailAccum( start+1, end, acc*start)
  }



  def Myfunc(start: BigInt, end: BigInt, c:(BigInt, BigInt) => BigInt) : BigInt = {
    c(start,end)
  }


  def main(args: Array[String]) : Unit = {
    println( Myfunc(2,4,Sum) )
    println( Myfunc(2,4,Mult) )
    println( Myfunc(2,4,SumTail) )
    println( Myfunc(2,4,MultTail) )
  }
}