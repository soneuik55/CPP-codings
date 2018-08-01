 
/*************************************************************** 
*  file: Son_Decoder.java  
*  author: Son, Sunghwan  
*  class: CS 141 Programming and Problem Solving  
*  
*  assignment: program 1  
*  date last modified: 1/12/2017  
*  
*  purpose: In order to practice input and output from txt file. 
*                   Especially, I have to know that string in the txt file is read line by line. For this reason,charAt is used to decode the keypause.
*                   Also, I use an array to store each integer on the 2nd line. After storing those numbers, they are used for charAt to decode. 
*
*  
****************************************************************/ 
import java.io.*;
import java.util.Scanner;

public class Son_Decoder
{
 public static void main(String[] args) throws IOException
 {

   Scanner keyboard=new Scanner(System.in);

   String fileName="";  //Variable to read from txt file.
   String keyPause="";  //Variable to store string from txt file.
   int Size=100;             // Temporary size for the array. 
   int [] numbers= new int[Size]; // The array to store each interger on the 2nd line.

    int count=0;  // This will be the real size for the array after counting the number of integer numbers on the 2nd line
   
    System.out.println("Enter the file to decode");
   fileName=keyboard.nextLine();

   File myFile=new File(fileName);
   Scanner inputFile=new Scanner(myFile);
   
   //To store String on the 1st line from the txt file. 
   keyPause=inputFile.nextLine();

     //To find out how many numbers to store into the array. In other words, to find out the the number of "count" from the 2nd line. 
     //Whenever an integer number is read, the count will be increased.
    while(inputFile.hasNextInt())
     {
       numbers[count]=inputFile.nextInt();
       count++;                                   
   }
    
    //Print out the message decoded
     System.out.print("Your secret message is: ");
   for(int i=0; i<count; i++)
   {
    System.out.print(keyPause.charAt(numbers[i]));
   
    }
   System.out.println();
 
  }//end of main
}//end of class
