/********************************************************
 file:PrimeChecker.java
 author: T. Diaz
 class: CS140 Introduction to Computer Science
 assignment: lab3
 date last modified: 11/22/2016
 purpose: to practice to create Java programs
********************************************************/
import java.util.Scanner;
import java.io.*;

public class PrimeChecker
{
  public static void main(String[] args)
 { 
   Scanner keyboard=new Scanner(System.in);
   int number;
   System.out.println("Enter a number: ");
   number=keyboard.nextInt();
   isPrime(number);
  }

 
   // in order to find the primbe number, I will find out if the number is even or odd
   // after than, when the number is even, it is divided by 2. >> when the reminder 0, it is not the prime number, except for the number 2
   //  When the number is odd, it is divided by 3 >> when the reminder 0, it is not the prime number, except for the number 3.
   // Also, the other exception set up is 1 which is not the prime number.

   static boolean isPrime(int number)
  {
   
   int rm=number%2;  // to decide if the number is even or odd.
   boolean result=true;  
   switch(rm)
   {
      case 0: // when the number is even
    {
       if(number==2)
        { 
         System.out.println("The number "+number+" is the prime number");
         result=true;
        }   
       else  { 
     System.out.println("This even number is not the prime number");
     result=false;
              }
     break;
    }//end of case0
   
    case 1: //when the number is odd
   {
     int rm2=number%3; 
      if(number==1)
       System.out.println("This is not the prime number");
      else if(number==3)
       System.out.println("The number"+number+" is the prime number");
     else if(rm2==0)
       {
        System.out.println("This odd number is not the prime number");
        result=false;
       }    
      else
        {
        System.out.println("The number is the prime number");
         result=true;
        }

    }   // end of case1
     
      
    }//end of the switch
     return result;
   }
}
