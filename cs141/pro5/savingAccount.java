 
/*************************************************************** 
*  file: savingAccount.java  
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
//This class extends Son_BankAccount class to inheritance
public class savingAccount extends Son_BankAccount
{
 boolean status=false;
  
 //constructor for savingAccount class
   public savingAccount( double balance, double interestRate)
  {
    super(balance, interestRate);
 
   }



// A method that determines whether the account is inactive before a withdrawal is made. (No withdrawal will be allowed if the account is not active.)
   public void withdraw(double amountOfwithdraw)
  {
        if(super.getBalance()<25)
          {
            status=false; 
            System.out.println("Your regular account is inactive.");
          
           } 
    else if(amountOfwithdraw>super.getBalance())
       {
         status=false;
              System.out.println("Error - Not enough funds.");
           }
   else if( status=true || (amountOfwithdraw<super.getBalance()))
            super.withdraw(amountOfwithdraw);   

 
 
 
   }//end of withdraw

//A method that determines whether the account is inactive before a deposit is made, using several If statements
 public void deposit(double amountOfDep)
 {
     if(super.getBalance()<25 || status==false)
        {
                    super.deposit(amountOfDep);
                     
          if( ((super.getBalance()>=25) || (amountOfDep>=25) )&& status==false )
                       {
                        status=true;
                        System.out.println("Regular account is now active.");
                       }
          else
                  System.out.println("Regular account is not active.");
        }
   else if(super.getBalance()>=25 || status==true || amountOfDep>=25 )
   {       
                   status=true;
            super.deposit(amountOfDep);
                 

   }
 
  }

//This method determines if monthly service fee is charged or not by using the number of withdraw
//Also, if the balance is under 25 dolloars, the account is inactive.
 public void monthlyProcess()
 {
     if(super.getNumberWithdraw()>4 && status!=false)
       {
       super.setMonthlyFee();
       super.monthlyProcess();
         }
           else if(super.getNumberWithdraw()<4)
             super.monthlyProcess();

     if(super.getBalance()<25)
      {
      System.out.println("Regular account is inactive.");
          status=false;
          }
    else if(super.getBalance()>25)
        {
         System.out.println("Regular account is now active.");
                status=true; 
                          super.monthlyProcess();	
         }


    
 }//end of monthlyProcess method.

}//end of savingAccount 
