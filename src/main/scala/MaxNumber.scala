class MaxNumber{

  def findMaxNumber(list: List[Int]): Int = {

    val intArray: Array[Int] = list.toArray
   var max :Int=intArray(0)

    for (i <- 1 until intArray.length) {
      if (intArray(i) > max)
        max = intArray(i)
    }
    max
  }
  }



object MaxNumber extends App {
  val ob = new MaxNumber
 print( ob.findMaxNumber(List(1,12,3,4)))


}
