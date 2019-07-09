class Interpolation {

  def doInterpolation(list:List[Int]):Unit=
  {


    val copylist=List(1,4,2,3)
    for(i<-copylist) println( s"${copylist.indexOf(i)}=$i")
  }
}
object  Interpolation extends  App{
  val ob =new Interpolation
  ob.doInterpolation(List(1,3,2,4))
}
