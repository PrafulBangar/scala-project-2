class SumOfProduct {


def findProduct(num:Int):Int =
{
  if (num==0)
    1
  else
  num*findProduct(num-1)
}

 def findSum(num:Int):Int=
 {
   if(num<10)
     num
   else
     num%10+findSum(num/10)
 }
}

object SumOfProduct extends  App{
  val ob =new SumOfProduct
  val result=ob.findProduct(5)
print(ob.findSum(result))
}

