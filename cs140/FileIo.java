/********************************************************
 file:FileIo.java
 author: T. Diaz
 class: CS140 Introduction to Computer Science
 assignment: lab3
 date last modified: 11/22/2016
 purpose: to practice Input and Output 
********************************************************/

import java.io.*;
import java.util.Scanner;

public class FileIo
{
 public static void main(String[] arge) throws IOException
 {
   Scanner keyboard=new Scanner(System.in);

   
   String myFile;
   String theSecond, theThird; // this is for saving outfiles.
 
   System.out.println("Enter input file name: ");
   myFile=keyboard.nextLine();
  
   System.out.println("Enter output file name: ");
   theSecond=keyboard.nextLine();
   
   System.out.println("Enter another output filename(append): ");
   theThird=keyboard.nextLine(); 

   File file=new File(myFile);  
   Scanner inputFile=new Scanner(file);
  
   PrintWriter outputFile=new PrintWriter(theSecond);
   

   FileWriter fwriter=new FileWriter(theThird,true); //to append data to the third fild
   PrintWriter outputFile2=new PrintWriter(fwriter);



  
   while(inputFile.hasNext())
    {
      String write2nd;
     
      String read=inputFile.nextLine();
      System.out.println(read);
      
      write2nd=read.toUpperCase();
      outputFile.println(write2nd);
      System.out.println(write2nd);
   

      String write3rd=write2nd; //copy the 2nd data  
      outputFile2.println(write3rd); // after copying the 2nd, append it to the 3rd file.
             
  }//end of the while  
       inputFile.close();   
       outputFile.close();
       outputFile2.close();
                         
 

  }//end of the main header

}//end of the class
