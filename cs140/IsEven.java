/******************
file: IsEven.java
author: T. Diaz
class: CS140 Introduction to Computer Science
assginment: lab2
last date modifeid: 11/1/16
purpose:to practice creating Java programs
******************************/

import java.util.Scanner;

public class IsEven
{
 public static void main(String[] args)
 {
  Scanner keyboard=new Scanner(System.in);
  System.out.println("Enter an integer from 0-10: ");
  int n=keyboard.nextInt(); //to let a user enter a number from 0 to 10

  if( n>=0 && n<=10) //to make a range for the input
  n=n%2;
  else
  System.out.println("You enter a wrong number");

 //switch used to decide if it is a even or not.

  switch(n)
  {
   case 0:
   System.out.print("It is even");
   break;

   case 1:
   System.out.print("It is not even");
   break;
  }//End of case
 }//End of main
}// End of class
