import java.util.Scanner;

public class BMI
{
 public static void main(String[] args)
 {
  Scanner input=new Scanner(System.in);
  double weight, height, BMI, Height; //Height is in the formula of BMI
  
  System.out.println("Enter your weight in pounds.");
  weight=input.nextDouble();
  System.out.println("Enter your height in inch(es).");
  height=input.nextDouble();
 
  Height=Math.pow(height,2);
  BMI=weight*703/Height;
 
  if( BMI>18.5 && BMI<25.0)
   System.out.println("Your weight is optimal");
  else if (BMI>25.0)
   System.out.println("Your weight is overweight");
  else if (BMI<18.5)
   System.out.println("Your weight is underweight");
  else 
   System.out.println("Invalid");
 }
}

  
