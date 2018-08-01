 
/*************************************************************** 
*  file: Son_BankAccount.java  
*  author: Son, Sunghwan  
*  class: CS 141 Programming and Problem Solving  
*  
*  assignment: program 5
*  date last modified: 2/28/2017  
*  
*  purpose: In order to practice using abstract class and inheritancing from the abstract class 
*                  
*                
*
*  
****************************************************************/ 
public abstract class Son_BankAccount
{
 private double balance;
 private int numOfDeposit;
 private int numOfWithdrawals;
 private double annualInterestRate;
 private int monthlyServiceFee;

 //this is constructor method intializing balance and annual Interset
  Son_BankAccount(double bal, double anInterest)
 {
  balance=bal;
  annualInterestRate=anInterest/100;
 }//end of constructor

  //this is deposit method that adds the deposit to the account balace
  //Also it counts the number of deposit this month.
   public void deposit(double dep)
  {
   balance=balance+dep;
   numOfDeposit++;
  }//end of deposit method
  
  //this is withdrawals mehod that subtracts withdrawls from the balance
  //italso count the number of withdrawals this mont. 
   public void withdraw(double with)
  {
     if(balance>with)
   balance=balance-with;
     
   numOfWithdrawals++;
  }
   
  //This methods calculates monthly interest and add the interest to the 
  //balance
   public void calcInterest()
   {
    double monthlyInterestRate= annualInterestRate / 12 ;
    double monthlyInterest= balance*monthlyInterestRate;
    balance=balance+monthlyInterest;

   }//end of clacInterest
 
  //This method subtract the monthly service charges from the balance
  //calls the calcInterest method, and set the numbers of deposits,
  //withdrawals and monthly service charges to zero. 
   public void monthlyProcess()
  {
       
       balance=(balance-monthlyServiceFee);

            if(balance>=25)
        calcInterest();

     numOfDeposit=0;
     numOfWithdrawals=0;
        

  }//end of monthlyProcess

   //This method returns balance.
    public double getBalance()
   {
    return balance;
   }

   //this method returns annual Interest rate
    public double getInterest()
   {
    return annualInterestRate;
   }

   //this method returns number of deposit per month
     public int getNumberDeposit()
   {
    return numOfDeposit;
   }
  
//this returns number of withdraw per month
     public int getNumberWithdraw()
   {
    return numOfWithdrawals;	
   }

//this method return monthly service fee
  public double getMonthlyFee()
  {
   return monthlyServiceFee;
  }

//this method calculates the monthly service fee
   public void setMonthlyFee()
  {
   monthlyServiceFee=numOfWithdrawals-4;
  }  

}//end of class
