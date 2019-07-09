  class BankManagement {

 var balance:Int=0

  def openAccont(acc_Id:Int,name : String): Unit =
  {

    println("Bank account created with ID="+acc_Id+" name="+name);

  }

  def depositeAmount(fund : Int):Unit=
  {
    balance=balance+fund
    println("amount "+fund+" added to account new balance = "+balance)
    println("new balance = "+balance)
  }

   def closeAccount():Unit=
   {
     this.balance=0;
     println("Account closed ")
println("new balance = "+balance)
   }

  def view():Unit=
  {
    println("balance in account = "+this.balance)
  }

    def withdraw(fund:Int):Unit=
    {
      if(fund<=balance)
      {balance=balance-fund
      println("amount deducted = "+balance)
      }
      else
       { println("you dont have enough balance")
      }

    }
}

object  BankManagement extends App {
  val ob = new BankManagement
  ob.openAccont (1, "praful")
  ob.depositeAmount (2000)
  ob.withdraw (150)
  ob.view ()
  ob.closeAccount ()

}
