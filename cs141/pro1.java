import java.util.Scanner;

public class pro1
{
  public static void main(String[] args)
 {
    double money;
    double quarter=0, dime=0, nickle=0, penny=0;
    double remain1, remain2, remain3 ;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the amount of money to have coins");
    money=keyboard.nextDouble();

   if(money >= 0.25)
    {
      quarter = (int)(money/0.25);
      remain1 = money-(quarter*0.25);
       if(remain1 >= 0.10)
         { 
           dime = (int)(remain1 / 0.1);
           remain2 = remain1 % 0.1;
           if( remain2 >= 0.05)  
            {
              nickle = remain2/0.05;
               remain3 = remain2%0.05;
               penny=remain3;
             }//end of if statement for nickle
        }//end of if statement for dime
        else if(remain1<0.10 ) ////////////////////////////start from here/////////////////////////////////
     }//end of if statement for quater
    else if(money < 0.25)
    {
       if(money>= 0.10)
         { 
           dime = (int)(money / 0.1);
           remain1 = money % 0.1;
           if( remain1 >= 0.05)  
            {
              nickle = remain1/0.05;
               remain2 = remain1%0.05;
               penny=remain2;
             }//end of if statement for nickle
            
        }//end of if statement for dime
    } //end of if statement for less than quarter
        

   System.out.println("25 cents: " + quarter);
   System.out.println("10 cents: " + dime);
   System.out.println("5cents: " + nickle); 
   System.out.println("1cent: " +penny);




 }//end of main method


}//end of class
