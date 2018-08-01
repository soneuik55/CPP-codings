import java.io.*;
import java.util.Random;

public class ICA52
{
 public static void main(String[] args)
 {
   int numberOfRolls;
   double finalAverage;
   System.out.println("Total on dice         Average");
   System.out.println("------------         ---------");
 
   for( int j=2; j<=12; j++)
   {
     finalAverage = Average(j);
     System.out.println(finalAverage);
   
   
   }
   System.out.println( j+               "," +"average");
   }//end of main

 static double Average(int n)
{
 

  int rollCountAverage;
  int rollTotal=0;
  double average;
 
  for(int i=0; i<=10000; i++)
  {
   rollCountAverage=rollFor(n);
   rollTotal+=rollCountAverage;
  }
  average= ((double)rollTotal) / 10000;
 return average;
} //end of avberage






  static int rollFor(int N)
  {
 
   int die1, die2;
   int roll;
   int rollCt=0;
   Random rand=new Random();
   do{
      die1=(int)(rand.nextInt(6)) +1;
      die2=(int)(rand.nextInt(6)) +1;
      roll= die1+die2;
      rollCt++;
      }while ( roll!=N);
    return rollCt;
    }




}


