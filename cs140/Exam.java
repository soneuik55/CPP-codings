/********************************************************
 file:Exam.java
 author: T. Diaz
 class: CS140 Introduction to Computer Science
 assignment: lab3
 date last modified: 11/22/2016
 purpose: to practice for loop and count
********************************************************/
import java.util.Scanner;

public class Exam
{
 public static void main(String[] args)
 {
  Scanner keyboard=new Scanner(System.in);
   int passes=0, failures=0, students, result;

  for( students=0; students<10; students++)
  {
   System.out.print("enter result (1=pass, 0=fail): ");
   result=keyboard.nextInt();   
   if(result==1)
     passes++;
   else if(result==0)
     failures++;
   else
    System.out.println("You enter the invailid nubmber");

  }//end of for loop
   System.out.println(passes + " passesd\n"   
                      + failures + " failed");
   if (passes<5)
      System.out.println("Raise tuition");
  } // end of main header
}//end of the class
