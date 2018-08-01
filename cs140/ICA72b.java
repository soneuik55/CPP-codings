import java.util.Scanner;
import java.io.*;

public class ICA72b
{
 public static void main(String[] args)
 {
   
   Scanner keyboard=new Scanner(System.in);
   int[] number=new int[6];
   int temp,min;
 
   System.out.println("Enter numbers to print out in order");
   for(int i=0; i<number.length;i++)
   {
      number[i]=keyboard.nextInt();
       min=i;
     for(int j=i+1; j<number.length; j++)
      { 
       if(number[j]<number[min])
        min=j;
      }
       temp=number[min];
       number[min]=number[i];
       number[i]=temp;
   }//end of for
    for(int k=0; k<number.length; k++)
      System.out.print(number[k]);
  }//end of main
}//end of class
