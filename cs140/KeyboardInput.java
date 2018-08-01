/***********************************
file: KeyboardInput.java
author: T. Diaz
Class: CS 140 Introduction to Computer Science
assignment: lab2
date last modifeid: 11/1/2016
purpose: to practice creating java programs
***********************************/

import java.util.Scanner;

public class KeyboardInput
{
 public static void main(String[] args)
 {
   String name, company;
   int age;
  
  Scanner input=new Scanner(System.in);

  //In order to let a user enter their name
  System.out.println("What is your name?");
  name=input.nextLine();

  //in order to let a user enter their age
  System.out.println("How old are you?");
  age=input.nextInt();
 
  input.nextLine(); // I need this code to not skip the next String value

  //in order to let a user enter their company name
  System.out.println("Enter your company name");
  company = input.nextLine();

  
  

 //now, this is print out sentences by using the inputs that the user has entered
 
 System.out.printf("My name is %s, "+"My age is %d and \n",name,age);
 System.out.printf("I hope to work for %s.\n",company);


 }//End of main
}//End of class
 
  
