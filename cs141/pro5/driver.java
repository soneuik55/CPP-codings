 
/*************************************************************** 
*  file: driver.java  
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

import java.util.Scanner;

public class driver
{
 public static void main(String[] args)
 { 
      //define variables
      String choice1, choice2;   
    double amoutOfdeposit, amoutOfwithdraw; 
      
     // Creating objects for regular and saving account, initialzing the balance and interest rate.
    savingAccount saving = new savingAccount(15,5);   
    regularAccount regular = new regularAccount(0,3);
     //creating the object for input from a user.
   Scanner keyboard=new Scanner(System.in);
   
       
     
  
      System.out.println("Which account would you like to access, regular or savings?: ");
         choice1=keyboard.nextLine();
     

   //using while loops and there are two switch statements in the while loop.
   while(!choice1.equals("quit"))
   {
     
    
      switch(choice1)
        {
             
          case "regular" :     
            {	
                      System.out.println("What action do you wish to perform");
                      System.out.println("(Withdraw, deposit, monthly processing)?:");
                        choice2=keyboard.nextLine();
                            
                                     
                                          switch(choice2)
                                                           {
                                                             case "withdraw":
                                                             {
                                                              System.out.println("Enter amount to withdraw:");
                                                               amoutOfwithdraw=keyboard.nextDouble();
                                                               regular.withdraw(amoutOfwithdraw);
                                                               System.out.printf("Account balance is: %.2f", regular.getBalance());
                                                                      System.out.println();  
                                                             }
                                                               break; //break for withdraw case
               
                                                               case "deposit" :
                                                                        {
                                                                         System.out.println("Enter amount to deposit:");
                                                                        amoutOfdeposit=keyboard.nextDouble();
                                                                         regular.deposit(amoutOfdeposit);
                                                                        System.out.printf("Account balance is: %.2f", regular.getBalance());
                                                                   System.out.println();
                                                                        }
                                                                                                    break; //break for deposit case
                                                               case "monthly processing" : 
                                                                 {
                                                          
                                                                   regular.monthlyProcess();	
                                                                   System.out.printf("Your balance is: %.2f", regular	.getBalance());
                                                                   }       
                                                               break; // break for deposit case
                                                                default:
                                                                            System.out.println("You enter wrong input");
                                                                                                                             
                                                                  }//end of switch for choice2
                      }        
                     break;
           
          case "savings":  
           {
             System.out.println("What action do you wish to perform"); 
             System.out.println ("(Withdraw, deposit, monthly processing)?:");
                     choice2=keyboard.nextLine();
                       
           
                        
                                                             switch(choice2)
                                                             {
                                                              case "withdraw":
                                                             {
                                                                System.out.println("Enter amount to withdraw:");
                                                                amoutOfwithdraw=keyboard.nextDouble();
                                                                saving.withdraw(amoutOfwithdraw);
                                                                System.out.printf("Account balance is: %.2f", saving.getBalance());
                                                   
                                                                           
                                                              }
                                                             break; //break for withdraw case
               
                                                            case "deposit" :
                                                             {
                                                            System.out.println("Enter amount to deposit:");
                                                            amoutOfdeposit=keyboard.nextDouble();
                                                            saving.deposit(amoutOfdeposit);
                                                              System.out.printf("Account balance is: %.2f", saving.getBalance());
                                               
                                                                   }
                                                            break; // break for deposit case
                 
                                                             case "monthly processing" : 
                                                           {
                                                          
                                                          saving.monthlyProcess();	
                                                          System.out.printf("Your balance is: %.2f", saving.getBalance());
                                                                      
                                                            }                 
                                                           break; //break for monthly processing
                                                                default:
                                                                            System.out.println("You enter wrong input");
                                                                      }//end of switch for choice2
                  }
                     break;
                   default:
                      System.out.println("You enter wrong input");

         }//end of switch for choice1                       
       System.out.println();
    System.out.println("Which account would you like to access, regular or savings?: ");
               	keyboard.nextLine();
         choice1=keyboard.nextLine();

}//end of while loop


 }//end of main

}//end of class
