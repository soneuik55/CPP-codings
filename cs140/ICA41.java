import java.util.Scanner;

public class ICA41
{ 
 public static void main(String[] args)
 {
   Scanner input=new Scanner(System.in);
   int number=0;
   int max=0;
   int min=0;
  
   for(int x=0; x<10; x++)
   {
    System.out.print("Enter a integer number: ");
   
    number=input.nextInt();
    
    if(x==0||number>max)
    {
     max =number;
     }

    if(x==0||number<min)
     {  
      min=number;
     }


   }//end of for
  
  System.out.println("Highest value:" +max);
  System.out.println("Lowest value:" +min);



  


 }
}
