import java.util.Scanner;

public class grade
{ 
  public static void main(String[] args)
  {   
   double score1, score2, score3, average;
  

   Scanner input=new Scanner(System.in);
   
   System.out.println("Enter your score1");
   score1=input.nextDouble();
   System.out.println("Enter your score2");
   score2=input.nextDouble();
   System.out.println("Enter your score3");
   score3=input.nextDouble();

   average= (score1+score2+score3)/3;
   
   if(average>=90)
   System.out.print("Your grade is A");
   else if(average>=80 && average<90)
   System.out.print("Your gradie is B");
   else if(average>=70 && average<80)
   System.out.print("Your grade is C");
   else if(average>=60 && average<70)
   System.out.print("Your grade is D");
   else if(average<60)
   System.out.print("Your grade is F");
   else
   System.out.println("Invalid input");

 


 }
}
