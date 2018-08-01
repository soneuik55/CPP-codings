/*************************************************************** 
*  file: Son_AsciiArt.java  
*  author: Son, Sunghwan  
*  class: CS 141 Programming and Problem Solving  
*  
*  assignment: program 3
*  date last modified: 1/31/2017  
*  
*  purpose: In order to practice using 2D arrays with for loops.
*               
*                   
*
*  
****************************************************************/ 
import java.io.*;
import java.util.Scanner;
//filling 2d-array from input file.

public class Son_AsciiArt
{
  
 public static void main(String[] args) throws IOException
 {
  String fileName;
   int ROWS=0;
   int COLS=0;
   String lineBy="";
   char[] lineArray= new char [COLS];

  Scanner keyboard=new Scanner(System.in);
  	
   // To read strings from the txt file.
   File myFile=new File("12");
    Scanner inputRead=new Scanner(myFile);
   
   ROWS=inputRead.nextInt();
   COLS=inputRead.nextInt();
   inputRead.nextLine();

   
  //creating a 2D array
   char [][] Asc= new char[ROWS][COLS];
      
//Filling the 2D array from txt file.
     for(int row=0; row<ROWS; row++)
    {
      lineBy=inputRead.nextLine();
      lineArray=lineBy.toCharArray();

      for(int col=0; col<COLS; col++)
      {
         Asc[row][col]= lineArray[col];
      }
   }
  

//calling methods
printArray(Asc, ROWS, COLS);

System.out.println("Transformation: ");


  for(int i=Asc.length-1; i>-1; i--)
   {
    for(int j=0; j<Asc[i].length; j++ )
     System.out.print(Asc[i][j]);

    System.out.println();
   }
   
 
   System.out.println();
   for(int i=0; i<Asc.length; i++)
   {
      for( int j=Asc[i].length-1; j>-1; j--)
        System.out.print(Asc[i][j]);
     

      System.out.println();
    }


  }// End of the main method


// method: printArray
// purpose:This method prints out the 2D array.
 public static void printArray(char[][] array, int ROWS, int COLS)
{
    //Print out the original file in the 2D Array,
      for(int row=0; row<ROWS; row++)
    {
      for(int col=0; col<COLS; col++)
      {  
         //Go to next line whenever the line reaches the end.
         if(col==0)
        System.out.println();
  
        System.out.print(array[row][col]);
       
      }
   }   
   
   System.out.println();
    System.out.println();
 }    


   
}//end of class
