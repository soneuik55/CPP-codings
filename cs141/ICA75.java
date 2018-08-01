import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ICA75
{
  public static void main(String[] args)throws IOException
 {
   String reader="";
   File myFile= new File("12");
   Scanner inputFile = new Scanner(myFile);
   int count=0;

  while(inputFile.hasNext())
  {
   reader=inputFile.nextLine();
   System.out.println(reader);
   
  }
  
  StringTokenizer strTokenizer=new StringTokenizer(reader, "\n");

  System.out.println(strTokenizer.countTokens());


   StringBuilder result = new StringBuilder("Barry, don't mess with the timeline.");

result.delete(0,8);
result.insert(0, "D");
result.insert(6,"stop me from ");
result.delete(19,28);
result.insert(19,"fixing");


  System.out.println(result);

StringTokenizer st = new StringTokenizer("one two three four"); 
String stuff = st.nextToken(); 
int x = st.countTokens(); 

 System.out.println(stuff);
  }



    
}
