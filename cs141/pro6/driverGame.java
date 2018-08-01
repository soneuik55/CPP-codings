 
/*************************************************************** 
*  file: Son_GameOfLife.java
*  author: Son, Sunghwan  
*  class: CS 141 Programming and Problem Solving  
*  
*  assignment: program 6
*  date last modified: 3/16/2017  
*  
*  purpose: In order to practice using recursion and exception theory. Through this program, I could understand the structure using if and for statement better.	
*                  
*                
*
*  
****************************************************************/ 

import java.util.Scanner;
import java.io.*;

public class driverGame
{
  public static void main(String[] args)throws IOException
  {
     String fileName;
     int generation=0;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the file name");
    fileName=keyboard.nextLine();

    System.out.println("Enter the generation");
  generation= keyboard.nextInt();


   Son_GameOfLife game = new Son_GameOfLife(fileName);
  
   game.computeNextGeneration(generation);


   }//end of main




}//end of class
