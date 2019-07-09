class Fibonacci{

  def findFibonacci(  Num :Int): Int  =
  {
    val number=Num;

    if(number==0)
      0
     else if (number == 1 )
          1
      else
             findFibonacci(number - 1) + findFibonacci(number - 2)
  }
}

object Fibonacci extends App
{
  var ob = new Fibonacci()
print(ob.findFibonacci(4))

}
//0 1 1 2 3 5