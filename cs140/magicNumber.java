import java.util.Scanner;

public class magicNumber
{
 public static void main(String[] args)
 {  
  int month, day, year;
  int time; // time = month*day
 
  Scanner input= new Scanner(System.in);
  System.out.println("Enter the current month");
  month=input.nextInt();
  System.out.println("Enter the current day");
  day=input.nextInt();
  System.out.println("Enter the current two digit year");
  year=input.nextInt();
 
  time=day*month;
  
  if(time==year)
   {
    System.out.println("It is a magic number");
   }
   else
   {
    System.out.println("It is not a magic number");
   }
 }
}
