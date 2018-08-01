/********************************************************
 file:MultiplicationLearner.java
 author: T. Diaz
 class: CS140 Introduction to Computer Science
 assignment: lab3
 date last modified: 11/22/2016
 purpose: to practice Random number.
********************************************************/
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class MultiplicationLearner
{
 public static void main(String[] args) throws IOException
 {
   int num1,num2;    // to save random number 1 and 2
   int yourAnswer;   // the anwer that a user enters
   int answer;      
   int exit;      
    
   Scanner keyboard=new Scanner(System.in);
   Random randomNum=new Random();  // This is for the random number1
   Random randomNum2=new Random(); // This is for the random number2
   Random say1=new Random();       // This random number will be used to choose one of 4 sentences by using if-else, when right
   Random say2=new Random();       // This random number will be used to choose one of 4 sentences by using if-else, when wrong
  
  do
  { 
   num1=randomNum.nextInt(9)+1;
   num2=randomNum2.nextInt(9)+1;
   answer=num1*num2;

   System.out.println("How much is "+num1+" times "+num2+ "?");
   yourAnswer=keyboard.nextInt();
    
   if(yourAnswer==answer)
   {
     int saying1=say1.nextInt(4)+1;
     if(saying1==1)
      System.out.println("Very good!");
     else if(saying1==2)
      System.out.println("Excellent!");
     else if(saying1==3)
      System.out.println("Nice work!");
     else
      System.out.println("Keep up the good work!");
   }
   else
   {
    int saying2=say2.nextInt(3)+1;
    if(saying2==1)
     System.out.println("No. please try again");
    else if(saying2==2)
     System.out.println("Wrong. Try once more");
    else if(saying2==3)
     System.out.println("Don't give up!");
    else
     System.out.println("No. Keep trying");
   }
   System.out.println("If you want to stop, Enter '-1'. If keep doing, insert any number");
   exit=keyboard.nextInt();
   if(exit==-1)
    System.exit(0);
    } while(exit!=-1);

  }//end of main header
}//end of the class  
