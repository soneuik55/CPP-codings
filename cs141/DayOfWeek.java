import java.util.Scanner;

public class DayOfWeek
{

 //Declare the day enumerated type
 enum Day { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, 
Saturday} 


 public static void main(String[] args)
 {
 
   

   Scanner keyboard=new Scanner(System.in);
   String chooseDay;
 
    System.out.println("A list of days");
    System.out.println(Day.Sunday);
    System.out.println(Day.Monday);
    System.out.println(Day.Tuesday);
    System.out.println(Day.Wednesday);
    System.out.println(Day.Thursday);
    System.out.println(Day.Friday);
    System.out.println(Day.Saturday);

  System.out.println("Select a day of the week");
   chooseDay=keyboard.nextLine();

 




   switch(chooseDay)
   {
     case "Sunday":
       System.out.println("the business is open from 11 to 5 on Sunday");
       break;
     
     //declarer the business hours for week days.
     case "Monday":
       System.out.println("the business is open from 9 to 9 on weekdays");
       break;
     case "Tuesday":
       System.out.println("the business is open from 9 to 9 on weekdays");
       break;
      case "Wednesday":
        System.out.println("the business is open from 9 to 9 on weekdays");
       break;
       case "Thursday":
        System.out.println("the business is open from 9 to 9 on weekdays");
       break;
       case "Firday":
        System.out.println("the business is open from 9 to 9 on weekdays");
       break;
       case "Saturday":
        System.out.println("the business is open from 10 to 6 on Saturday");
       break;
    }
 



  }// end of main
}  //end of class
