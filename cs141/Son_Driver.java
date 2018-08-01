 /*************************************************************** 
*  file: Son_Decoder.java  
*  author: Son, Sunghwan  
*  class: CS 141 Programming and Problem Solving  
*  
*  assignment: program 2
*  date last modified: 1/24/2017  
*  
*  purpose: This file is have the main method to execute the file 'Son_Geometry' that has no main method
*           In this file, I use while loop and switch to let a user choose 4 cases( Area of Circle, Area of Rectangle, Area of Triangle, and quit).
*                   
*
*  
****************************************************************/ 

import java.util.Scanner;

public class Son_Driver
{
 public static void main(String[] args)
 {
  double AreaOfTriangle=0, AreaOfRectangle=0, AreaOfCircle=0;
  int chooseArea=0;                                  
  double radius, width, length, height, base;
  Scanner keyboard=new Scanner(System.in);

 
 // While loop is used to keep executing this program unless the user enter 4. 
  while(chooseArea!=4)
 {
  System.out.println("Geometry Calculator");
  System.out.println("1. Calculate the Area of a Circle");
  System.out.println("2. Calculate the Area of a Rectangle");
  System.out.println("3. Calculate the Area of a Triangle");
  System.out.println("4. Quit");
   
  chooseArea=keyboard.nextInt();  // This vairable is used in switch.


   // switch is used to let a user to choose one of 4 cases. 
  switch(chooseArea)
  {
   case 1:
    {
     System.out.println("Enter the radius");
     radius=keyboard.nextDouble();
     AreaOfCircle=Son_Geometry.AreaC(radius);
       System.out.printf("The area of the circle is: %2.2f \n",AreaOfCircle);
       }//end of case1
        break;
 
     case 2:
    {
     System.out.println("Enter the length");
     length=keyboard.nextDouble();
     System.out.println("Enter the width");
     width=keyboard.nextDouble();
     AreaOfRectangle=Son_Geometry.AreaR(length,width);
     System.out.printf("The area of the Rectangle is: %2.2f \n",AreaOfRectangle);
     }//end of case2
     break;
  
   case 3:
    {
     System.out.println("Enter the height");
     height=keyboard.nextDouble();
     System.out.println("Enter the base");
     base=keyboard.nextDouble();
     AreaOfTriangle=Son_Geometry.AreaT(height,base);
       System.out.printf("The area of the Triangle is: %2.2f \n",AreaOfTriangle);
     }//end of case3
     break;
    case 4:
     break;

  }//end of switch
 
 }//end of while
}//end of main
}//end of class
