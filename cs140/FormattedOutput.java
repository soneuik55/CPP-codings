/********************
file:FormattedOutput.java
author: T. Diaz
class:CS140 Introduction to Computer Science
assignment:lab2
date last modified: 11/1/2016
purpose: to practice creating Java programs
************************/





public class FormattedOutput
{
 public static void main(String[] args)
 { 
   //These are a list to print out
   String name = "Son Sunghwan";
   String major = "Computer Science";
   String class1 = "cs'140'", class2 = "bio'110'", class3 = "IGE'320'";
   String class4 = "Bio'l11'"; 

   //I will print out by using println
   System.out.println("Student: "+"\""+name+"\"");
   System.out.println("Magor: "+"\\"+major+"\\");
   System.out.println("Study list: "+class1+","+class2+","+class3+",and "+class4);
 
  }
} 
