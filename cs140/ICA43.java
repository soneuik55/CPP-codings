import java.util.Scanner;
import java.io.*;

public class ICA43
{
 public static void main(String[] args) throws IOException
{
  Scanner keyboard=new Scanner(System.in);
  String filename;
  int number=100;  
  String findCh;
  String findNum;
  PrintWriter outputFile=new PrintWriter("data.txt");
  outputFile.println("eeee");
  outputFile.println("how are you");
  outputFile.println("CSCSCSCSCS");
  outputFile.close(); 
  int count=0;
 
  System.out.println("Enter the file name");
  filename=keyboard.nextLine();

  File myFile=new File(filename);
  Scanner inputFile=new Scanner(myFile);
   
  System.out.println("Enter the charceter to find");
  findCh=keyboard.nextLine.charAt(0);
 
 while(inputFile.hasNext())
{
  
  String reader=inputFile.nextLine();
  for( int i=0; i<=reader.length(); i++)
   if(reader.charAt(i)==findCh)
     count++;
}

 System.out.println("number of ch: "+count);

}
}

