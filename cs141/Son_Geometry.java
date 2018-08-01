 /*************************************************************** 
*  file: Son_Decoder.java  
*  author: Son, Sunghwan  
*  class: CS 141 Programming and Problem Solving  
*  
*  assignment: program 2
*  date last modified: 1/24/2017  
*  
*  purpose: In order to practice using static methods and private  
*           Also, I can remember that i mush have main method in another file in order to execute this because this class has no main method.        
*                   
*
*  
****************************************************************/ 
import java.util.Scanner;

public class Son_Geometry
{
 private static double radius,AreaOfCircle;
 private static double length,width,AreaOfRectangle;
 private static double height,base,AreaOfTriangle;


// method: AreaC
// purpose:This method get a value for radius of the circle and returns the area of the circle. Also, if the value entered is a negative number, an error message will show up.
 public static double AreaC(double r)
 {
  radius=r;
   if(radius<0)
   {
   System.out.println("There is an error in your value! It must be an positive value");
   System.exit(0);
   }
  AreaOfCircle=Math.PI*radius*radius;  
  return AreaOfCircle;
 }
 
// method: AreaR
// purpose:This method get two values for length and width for the area of a rectangle and returns the area of the rectangle. 
//  Also, if the value entered is a negative number, an error message will show up.
 public static double AreaR(double l, double w)
 {
  length=l;
  width=w;
    if(length<0 || width<0)
   {
   System.out.println("There is an error in your value! It must be an positive value");
   System.exit(0);
   }
  AreaOfRectangle=l*w;
  return AreaOfRectangle;
 }

// method: AreaT
// purpose:This method get two values for height and base for the area of a triangle and returns the area of the triangle. 
//  Also, if the value entered is a negative number, an error message will show up.
 public static double AreaT(double h, double b)
 {
  height=h;
  base=b;
    if(height<0 || base<0)
   {
   System.out.println("There is an error in your value! It must be an positive value");
   System.exit(0);
   }
  AreaOfTriangle=h*b*0.5;
  return AreaOfTriangle;
 }

}
