import java.io.*;
import java.util.Scanner;

public class ICA42
{
  public static void main(String[] args) throws IOException
 {

  PrintWriter outputFile= new PrintWriter("NumberList.txt");
  
  for( int i=0; i<=100; i++)
  {
    System.out.println(i);
    outputFile.println(i) ;
   
  }
  }
}
  
