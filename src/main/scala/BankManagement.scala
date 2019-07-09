  class BankManagement {

 var balance:Int=0

    var name :String="CustomerName"
  def openAccont(acc_Id:Int,name : String): Unit =
  {
this.name=name;
    println("Bank account created with ID="+acc_Id+" name="+name);

  }

  def depositeAmount(fund : Int):Int=
  {
    balance=balance+fund
    println("amount "+fund+" deposited to account "+this.name +" newbalance is = "+balance)
    balance
  }

   def closeAccount():Unit=
   {
     this.balance=0;
     println("Account closed ")
println("new balance = "+balance)
   }

  def view():Int=
  {

   println("balance in account = "+this.balance)
 this.balance
  }

    def withdraw(fund:Int):Unit= {
      if (fund <= balance) {
        balance = balance - fund
        println("amount "+fund+" deducted from account "+this.name+" new balance is = " + balance)
      }
      else {
        println("you dont have enough balance")
      }

    }
}

object  BankManagement extends App {
  val ob = new BankManagement
  val ob1 = new BankManagement

  ob.openAccont (1, "praful")
  ob1.openAccont (2, "knoldus")

  ob.depositeAmount (2000)
  ob1.depositeAmount (3000)

  ob.withdraw (150)
transfer(300)


  def transfer(fund : Int):Unit= {
    println("fund transfered succesfully from "+ob1.name+" to "+ob.name)
    println("praful Initial")
    ob.balance = ob.view() + fund
    println("after fund transfer of "+fund+" RS")
    ob.view()
    println("knoldus Initial")
    ob1.balance = ob1.view() - fund
    println("after fund transfer of "+fund+" RS")

    ob1.view()
  }
println("closing account forever")
    ob.closeAccount ()



}
